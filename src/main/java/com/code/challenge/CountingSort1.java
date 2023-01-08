package com.code.challenge;

import java.util.Random;

public class CountingSort1 {

  public static void main(String[] args) {
    int limit = 1000;
    int[] toSort = new int[limit];
    Random rand = new Random();

    for (int x = 0; x < toSort.length; x++) {
      toSort[x] = rand.nextInt(limit);
    }
  }

  public void sortIt(int[] toSort) {

    int[] sortIndexes = new int[toSort.length];
    for (int sort : toSort) {
      sortIndexes[sort] = sortIndexes[sort] + 1;
    }

    int[] sorted = new int[toSort.length];
    int z = 0;

    for (int x = 0; x < toSort.length; x++) {
      for (int y = 0; y < sortIndexes[x]; y++) {
        sorted[z++] = x;
      }
    }

    for (int x : sorted) {
      System.out.println(x);
    }
  }
}
