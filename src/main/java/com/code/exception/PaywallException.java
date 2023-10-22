package com.code.exception;

public class PaywallException extends RuntimeException {

  public PaywallException(String message) {
    super(message);
  }

  public PaywallException(String message, Throwable cause) {
    super(message, cause);
  }

  public PaywallException(Throwable cause) {
    super(cause);
  }

  public PaywallException(String message, Throwable cause, boolean enableSuppression,
                          boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }


  public String internalMessage() {
    return "Internal message";
  }
}
