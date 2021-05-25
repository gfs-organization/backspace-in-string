package com.gfs.backspaceinstring.benchmark;

public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
        System.gc();
        final long memoryInUse = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
        System.out.println("Memmory use: " + memoryInUse + "Kb");
    }
}