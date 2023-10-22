package com.code.challenge.benchmark;

import com.code.challenge.Xbonacci;

public class XbonacciBenchmarker {


  //@Benchmark
  //@OutputTimeUnit(TimeUnit.NANOSECONDS)
  //@BenchmarkMode(Mode.AverageTime)
  public void tribonacci_test() {
    Xbonacci target = new Xbonacci();

    final int limit = 1000000;
    target.tribonacci(new double[] {1, 1, 1}, limit);

  }
}
