package com.code.challenge.benchmark;

import com.code.challenge.SwitchVsIfElse;
import com.code.exception.MissingException;

public class SwitchVsIfElseBenchmarker {

  //@Benchmark
  //@OutputTimeUnit(TimeUnit.NANOSECONDS)
  //@BenchmarkMode(Mode.AverageTime)
  public void benchmark_test() {
    int limit = 1000000;
    System.out.println("Using the ifs");

    for (int x = 0; x <= limit; x++) {
      //ExceptionResponseHelper.processException(new MissingException("missing"), "missing");
      SwitchVsIfElse.findErrorWithIfs(new MissingException("missing"), "missing");
    }

  }

}
