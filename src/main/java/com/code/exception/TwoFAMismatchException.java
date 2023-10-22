package com.code.exception;

public class TwoFAMismatchException extends RuntimeException {

  public TwoFAMismatchException(String message) {
    super(message);
  }

  public TwoFAMismatchException(String message, Throwable cause) {
    super(message, cause);
  }

}
