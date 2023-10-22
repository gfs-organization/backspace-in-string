package com.code.exception;

public class SplitNotEnabledException extends RuntimeException {

  public SplitNotEnabledException(String message) {
    super(message);
  }

  public SplitNotEnabledException(String message, Throwable cause) {
    super(message, cause);
  }

  public SplitNotEnabledException(Throwable cause) {
    super(cause);
  }

  public SplitNotEnabledException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
