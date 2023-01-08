package com.code.challenge.benchmark;

import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.profile.JavaFlightRecorderProfiler;
import org.openjdk.jmh.profile.StackProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class BenchmarkRunner {

  //153984
  public static void main(String[] args) throws Exception {
    //        org.openjdk.jmh.Main.main(args);

    //@formatter:off
        new Runner(new OptionsBuilder()
                .measurementTime(TimeValue.seconds(1))
                .warmupTime(TimeValue.seconds(1))
                .addProfiler(GCProfiler.class)
                .addProfiler(StackProfiler.class)
                .addProfiler(JavaFlightRecorderProfiler.class)
                .build())
                .run();
        //@formatter:on
  }
}