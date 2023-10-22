package com.code.exception;

public class HasDependentsException extends RuntimeException {

  public HasDependentsException(String message) {
    super(message);
  }

  public HasDependentsException(String message, Throwable cause) {
    super(message, cause);
  }

  public HasDependentsException(Throwable cause) {
    super(cause);
  }

  public HasDependentsException(String message, Throwable cause, boolean enableSuppression,
                                boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
