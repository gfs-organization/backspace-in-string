package com.code.dto;

import com.code.exception.ArchiveWithDependenciesException;
import com.code.exception.MissingException;

public enum ExceptionEnum {


  MISSING_EXCEPTION(MissingException.class),
  NULL_POINTER_EXCEPTION(NullPointerException.class),
  ILLEGAL_ARGUMENT_EXCEPTION(IllegalArgumentException.class),
  ILLEGAL_STATE_EXCEPTION(IllegalStateException.class),
  ARCHIVE_WITH_DEPENDENCIES_EXCEPTION(ArchiveWithDependenciesException.class),
  ;

  private Class<?> clazz;

  ExceptionEnum(Class<?> clazz) {
    this.clazz = clazz;
  }
}
