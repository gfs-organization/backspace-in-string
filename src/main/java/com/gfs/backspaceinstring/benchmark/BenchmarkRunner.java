package com.gfs.backspaceinstring.benchmark;

public class BenchmarkRunner {

    //153984
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);

        //@formatter:off
//        new Runner(new OptionsBuilder()
//                .measurementTime(TimeValue.seconds(1))
//                .warmupTime(TimeValue.seconds(1))
//                .addProfiler(GCProfiler.class)
//                .addProfiler(ForcedGcMemoryProfiler.class)
//                .build())
//                .run();
        //@formatter:on
    }
}