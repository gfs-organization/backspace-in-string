package com.code.exception;

public class DuplicatedSegmentV2Configuration extends RuntimeException {

  public DuplicatedSegmentV2Configuration(String message) {
    super(message);
  }

  public DuplicatedSegmentV2Configuration(String message, Throwable cause) {
    super(message, cause);
  }

  public DuplicatedSegmentV2Configuration(Throwable cause) {
    super(cause);
  }

  public DuplicatedSegmentV2Configuration(String message, Throwable cause, boolean enableSuppression,
                                          boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
