package com.code.challenge.benchmark;

import com.code.challenge.MapLoop;
import com.code.dto.APIMessage;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

public class MapLoopBenchmarker {

  @State(Scope.Thread)
  public static class MyState {

    public static final int mapSize = 1000;
    public static Map<String, APIMessage> map = new HashMap<>(mapSize);

    static {
      for (int x = mapSize; x > 0; x--) {
        map.put(RandomStringUtil.generateRandomString(5) + x, new APIMessage(x, RandomStringUtil.generateRandomString(20)));
      }
    }
  }

  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void myLoopTest() {
    MapLoop.solution(MyState.map);

  }

  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void myLoopTest2() {
    MapLoop.solution2(MyState.map);

  }

  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void myLoopTest3() {
    MapLoop.solution3(MyState.map);

  }
}
