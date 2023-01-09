package com.code.challenge;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.DoubleStream;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    final double[] result = new double[n];

    result[0] = s[0];
    result[1] = s[1];
    result[2] = s[2];

    for (int x = 3; x < n; x++) {
      result[x] = result[x - 1] + result[x - 2] + result[x - 3];
    }

    return result;
  }

  public double[] tribonacci_stream(double[] s, int n) {

    AtomicInteger x = new AtomicInteger(1);
    return DoubleStream.iterate(s[0],
            current -> {
              if (x.intValue() < 3) {
                current = s[x.getAndIncrement()];
              } else {
                current = s[0] + s[1] + s[2];
                s[0] = s[1];
                s[1] = s[2];
                s[2] = current;
              }

              return current;
            })
        .limit(n)
        .toArray();

  }
}
