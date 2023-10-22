package com.code.exception;

public class SentryServiceHookException extends RuntimeException {

  public SentryServiceHookException(String message) {
    super(message);
  }

  public SentryServiceHookException(String message, Throwable cause) {
    super(message, cause);
  }
}
