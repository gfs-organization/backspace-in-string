package com.code.exception;

public class DuplicatedDefinitionException extends RuntimeException {

  public DuplicatedDefinitionException(String message) {
    super(message);
  }

  public DuplicatedDefinitionException(String message, Throwable cause) {
    super(message, cause);
  }

}
