package com.code.exception;

public class SegmentServiceException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public SegmentServiceException(String message) {
    super(message);
  }

  public SegmentServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  public SegmentServiceException(Throwable cause) {
    super(cause);
  }

  public SegmentServiceException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);

  }

  public int getStatusCode() {
    return 404;
  }
}
