package com.code.challenge;

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
}
