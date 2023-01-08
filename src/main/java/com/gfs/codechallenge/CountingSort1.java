package com.gfs.codechallenge;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;


public class CountingSort1 {

  public static void main(String[] args) {
    int limit = 1000;
    int[] toSort = new int[limit];
    Random rand = new Random();

    for (int x = 0; x < toSort.length; x++) {
      toSort[x] = rand.nextInt(limit);
    }
  }

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
  public void sortIt(MyState myState) {

    int[] sortIndexes = new int[myState.toSort.length];
    for (int sort : myState.toSort) {
      sortIndexes[sort] = sortIndexes[sort] + 1;
    }

    int[] sorted = new int[myState.toSort.length];
    int z = 0;

    for (int x = 0; x < myState.toSort.length; x++) {
      for (int y = 0; y < sortIndexes[x]; y++) {
        sorted[z++] = x;
      }
    }

    for (int x : sorted) {
      System.out.println(x);
    }
  }
}
