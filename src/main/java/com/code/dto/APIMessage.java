package com.code.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class APIMessage {

  @NonNull
  private int code;
  @NonNull
  private String message;
  private String details;
  private String transactionId;

}
