package com.code.exception;

public class ScheduleLimitFailedException extends RuntimeException {

  public ScheduleLimitFailedException(String message) {
    super(message);
  }

  public ScheduleLimitFailedException(String message, Throwable cause) {
    super(message, cause);
  }

  public ScheduleLimitFailedException(Throwable cause) {
    super(cause);
  }

  public ScheduleLimitFailedException(String message, Throwable cause, boolean enableSuppression,
                                      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
