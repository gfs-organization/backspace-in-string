package com.code.exception;

public class DuplicatedConfigurationException extends RuntimeException {

  public DuplicatedConfigurationException(String message) {
    super(message);
  }

  public DuplicatedConfigurationException(String message, Throwable cause) {
    super(message, cause);
  }

  public DuplicatedConfigurationException(Throwable cause) {
    super(cause);
  }

  public DuplicatedConfigurationException(String message, Throwable cause, boolean enableSuppression,
                                          boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
