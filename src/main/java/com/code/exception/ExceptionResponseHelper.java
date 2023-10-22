package com.code.exception;

import com.code.dto.APIMessage;
import jakarta.ws.rs.ForbiddenException;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.InvalidObjectException;
import org.apache.http.HttpStatus;

public class ExceptionResponseHelper {

  public static com.code.dto.Response processException(NotAuthorizedException throwable, String userMessage) {
    return unauthorized("Unauthorized");
  }

  public static com.code.dto.Response processException(PaywallException throwable, String userMessage) {
    return createJsonResponse(Response.Status.PAYMENT_REQUIRED, throwable.internalMessage());
  }

  public static com.code.dto.Response processException(WebApplicationException throwable, String userMessage) {
    return createJsonResponse(throwable.getResponse().getStatus(), userMessage);
  }

  public static com.code.dto.Response processException(ForbiddenException throwable, String userMessage) {
    return createJsonResponse(Response.Status.FORBIDDEN, userMessage);
  }

  public static com.code.dto.Response processException(SplitNotEnabledException throwable, String userMessage) {
    return createJsonResponse(Response.Status.FORBIDDEN, userMessage);
  }

  public static com.code.dto.Response processException(ScheduleLimitFailedException throwable, String userMessage) {
    return createJsonResponse(Response.Status.FORBIDDEN, userMessage);
  }

  public static com.code.dto.Response processException(Throwable throwable, String userMessage) {
    return createServerError(userMessage);
  }

  public com.code.dto.Response findErrorWithIfs(Throwable throwable, String userMessage) {

    if (throwable instanceof IllegalArgumentException
        || throwable instanceof NullPointerException
        || throwable instanceof SplitValidationException
        || throwable instanceof HasDependentsException
        || throwable instanceof IllegalStateException
        || throwable instanceof InvalidObjectException
        || throwable instanceof IntegrationJiraConfigurationException
        || throwable instanceof DateOutOfRangeException) {
      return createJsonResponse(Response.Status.BAD_REQUEST, userMessage);
    }

    if (throwable instanceof ResourceNotFoundException) {
      return createJsonResponse(Response.Status.NOT_FOUND, userMessage);
    }

    if (throwable instanceof ResourceAlreadyExistsException
        || throwable instanceof DuplicatedSegmentV2Configuration
        || throwable instanceof DuplicatedConfigurationException
        || throwable instanceof SentryInstallationNotFoundException
        || throwable instanceof SentryServiceHookException) {
      if (throwable.getCause() instanceof DuplicatedNameException) {
        return createJsonResponse(
            Response.Status.CONFLICT.getStatusCode(), "metric message");
      }
      if (throwable.getCause() instanceof DuplicatedDefinitionException) {
        return createJsonResponse(
            Response.Status.CONFLICT.getStatusCode(), "metric message");
      }
      return createJsonResponse(Response.Status.CONFLICT, userMessage);
    }

    if (throwable instanceof TwoFAMismatchException) {
      return createJsonResponse(Response.Status.EXPECTATION_FAILED, userMessage);
    }

    if (throwable instanceof SplitNotEnabledException) {
      return createJsonResponse(Response.Status.FORBIDDEN, userMessage);
    }

    if (throwable instanceof PendingChangeException) {
      return createJsonResponse(HttpStatus.SC_LOCKED, userMessage, throwable.getMessage());
    }

    if (throwable instanceof ResourceLeasingException) {
      long leaseTime = ((ResourceLeasingException) throwable).getLeaseTime();
      int retryAfter = Long.valueOf(leaseTime / 1000).intValue();
      return createJsonResponseWithRetryAfterHeader(Response.Status.SERVICE_UNAVAILABLE.getStatusCode(),
          userMessage,
          throwable.getMessage(),
          retryAfter);
    }

    if (throwable instanceof ArchiveWithDependenciesException) {
      return createJsonResponse(
          Response.Status.CONFLICT.getStatusCode(), userMessage, throwable.getMessage());
    }

    if (throwable instanceof SegmentServiceException) {
      int statusCode = ((SegmentServiceException) throwable).getStatusCode();
      switch (statusCode) {
        case HttpStatus.SC_BAD_REQUEST:
          return badRequest();
        default:
          return internalServerEror();
      }
    }
    return createServerError(userMessage);
  }

  /**
   * Constructs always a JSON type error response to make things easy for the UI to show errors.
   *
   * @param userMessage user-friendly message
   * @return a Response of type JSON containing an HTTP code and a message
   */
  public static com.code.dto.Response createServerError(String userMessage) {
    return createJsonResponse(Response.Status.INTERNAL_SERVER_ERROR, userMessage);
  }

  /**
   * Constructs always a JSON type response to make things easy for the UI to show errors.
   *
   * @param status      HTTP status code
   * @param userMessage user-friendly message
   * @return a Response of type JSON containing an HTTP code and a message
   */
  public static com.code.dto.Response createJsonResponse(Response.Status status, String userMessage) {
    return createJsonResponse(status.getStatusCode(), userMessage);
  }

  public static com.code.dto.Response createJsonResponse(int status, String userMessage) {
    return createJsonResponse(status, userMessage, null);
  }

  /**
   * Constructs always a JSON type response to make things easy for the UI to show errors.
   *
   * @param status      HTTP status code
   * @param userMessage user-friendly message
   * @return a Response of type JSON containing an HTTP code and a message
   */
  public static com.code.dto.Response createJsonResponse(int status, String userMessage, String details) {
    return com.code.dto.Response.builder()
        .status(status)
        .type(MediaType.APPLICATION_JSON_TYPE)
        .entity(
            new APIMessage(
                status,
                userMessage == null ? "" : userMessage,
                details == null ? "" : details,
                "tracer id"))
        .build();
  }

  /**
   * Constructs a JSON HTTP Response including an RetryAfter Header.
   *
   * @param status            the associated HTTP Status
   * @param userMessage       a user-friendly message to be included as part of the response
   * @param details           a detail message to be included as part of the response
   * @param retryAfterSeconds A non-negative decimal integer indicating the seconds to delay after the response is received
   * @return the generated JSON HTTP Response
   */
  public static com.code.dto.Response createJsonResponseWithRetryAfterHeader(int status, String userMessage, String details, int retryAfterSeconds) {
    return com.code.dto.Response.builder()
        .status(status)
        .type(MediaType.APPLICATION_JSON_TYPE)
        .entity(new APIMessage(status,
            userMessage == null ? "" : userMessage,
            details == null ? "" : details,
            "tracerId"))
        .build();
  }

  public static com.code.dto.Response unauthorized(String message) {
    return createJsonResponse(Response.Status.UNAUTHORIZED, message);
  }

  public static com.code.dto.Response badRequest() {
    return createJsonResponse(Response.Status.BAD_REQUEST, null);
  }

  public static com.code.dto.Response internalServerEror() {
    return createJsonResponse(Response.Status.INTERNAL_SERVER_ERROR, null);
  }


}
