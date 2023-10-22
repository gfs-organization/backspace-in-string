package com.code.exception;

public class PendingChangeException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public PendingChangeException(String message) {
    super(message);
  }

  public PendingChangeException(String message, Throwable cause) {
    super(message, cause);
  }

  public PendingChangeException(Throwable cause) {
    super(cause);
  }

  public PendingChangeException(String message, Throwable cause, boolean enableSuppression,
                                boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);

  }

}
