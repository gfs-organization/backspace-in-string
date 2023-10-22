package com.code.exception;

public class DuplicatedNameException extends RuntimeException {

  public DuplicatedNameException(String message) {
    super(message);
  }

  public DuplicatedNameException(String message, Throwable cause) {
    super(message, cause);
  }
}
