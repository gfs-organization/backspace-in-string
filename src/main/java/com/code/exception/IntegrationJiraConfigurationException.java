package com.code.exception;

public class IntegrationJiraConfigurationException extends RuntimeException {

  public IntegrationJiraConfigurationException(String message) {
    super(message);
  }

  public IntegrationJiraConfigurationException(String message, Throwable cause) {
    super(message, cause);
  }

  public IntegrationJiraConfigurationException(Throwable cause) {
    super(cause);
  }

  public IntegrationJiraConfigurationException(String message, Throwable cause, boolean enableSuppression,
                                               boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
