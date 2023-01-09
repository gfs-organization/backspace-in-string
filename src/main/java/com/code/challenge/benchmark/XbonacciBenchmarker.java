package com.code.challenge.benchmark;

import com.code.challenge.Xbonacci;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

public class XbonacciBenchmarker {


  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void tribonacci_test() {
    Xbonacci target = new Xbonacci();

    final int limit = 10000;
    target.tribonacci(new double[] {1, 1, 1}, limit);

  }
}
