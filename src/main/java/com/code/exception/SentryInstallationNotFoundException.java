package com.code.exception;

public class SentryInstallationNotFoundException extends RuntimeException {

  public SentryInstallationNotFoundException(String message) {
    super(message);
  }

  public SentryInstallationNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public SentryInstallationNotFoundException(Throwable cause) {
    super(cause);
  }

  public SentryInstallationNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                             boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
