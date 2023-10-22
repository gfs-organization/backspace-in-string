package com.code.exception;

public class DateOutOfRangeException extends RuntimeException {

  public DateOutOfRangeException(String message) {
    super(message);
  }

  public DateOutOfRangeException(String message, Throwable cause) {
    super(message, cause);
  }

  public DateOutOfRangeException(Throwable cause) {
    super(cause);
  }

  public DateOutOfRangeException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
