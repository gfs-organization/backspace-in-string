package com.code.challenge.benchmark;

import com.code.challenge.CountingSort1;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

public class CountingSortBenchmarker {

  @State(Scope.Thread)
  public static class MyState {

    public static final int limit = 1000;
    public static int[] toSort = new int[limit];
    static Random rand = new Random();

    static {
      for (int x = 0; x < toSort.length; x++) {
        toSort[x] = rand.nextInt(limit);
      }
    }
  }

  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void countingSort_test(CountingSortBenchmarker.MyState state) {
    CountingSort1 target = new CountingSort1();

    target.sortIt(state.toSort);

  }
}
