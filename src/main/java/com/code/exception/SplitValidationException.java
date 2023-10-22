package com.code.exception;

public class SplitValidationException extends RuntimeException {

  public SplitValidationException(String message) {
    super(message);
  }

  public SplitValidationException(String message, Throwable cause) {
    super(message, cause);
  }

  public SplitValidationException(Throwable cause) {
    super(cause);
  }

  public SplitValidationException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
