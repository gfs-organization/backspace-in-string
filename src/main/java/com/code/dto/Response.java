package com.code.dto;

import jakarta.ws.rs.core.MediaType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

  private int status;
  private MediaType type;
  private APIMessage entity;

}
