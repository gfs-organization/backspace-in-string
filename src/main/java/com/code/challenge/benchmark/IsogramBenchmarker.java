package com.code.challenge.benchmark;

import com.code.challenge.Isogram;

public class IsogramBenchmarker {

  private static final String ALL_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789!@#$%^&*()_+{}|:<>?[]\\;',./`~";
  private static final String NO_REPEATING_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+{}|:<>?[]\\;',./`~";


  //@Benchmark
  //@OutputTimeUnit(TimeUnit.NANOSECONDS)
  //@BenchmarkMode(Mode.AverageTime)
  public void benchmark_test() {

    for (int i = 0; i < 100000; i++) {
      Isogram.isIsogram2(ALL_CHARACTERS);
      Isogram.isIsogram2(NO_REPEATING_CHARACTERS);
    }
  }

}
