package com.code.exception;

public class ArchiveWithDependenciesException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ArchiveWithDependenciesException(String message) {
    super(message);
  }

  public ArchiveWithDependenciesException(String message, Throwable cause) {
    super(message, cause);
  }

  public ArchiveWithDependenciesException(Throwable cause) {
    super(cause);
  }

  public ArchiveWithDependenciesException(String message, Throwable cause,
                                          boolean enableSuppression,
                                          boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);

  }

}
