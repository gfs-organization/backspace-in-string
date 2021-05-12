package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StringOrderCheckTest {

    private StringOrderCheck target;

    @Before
    public void setup() {
        target = new StringOrderCheck();
    }

    @Test
    public void shouldReturnOrderedStringWhenLettersNotInOrder() {
        final String testString = "zbcdefghijklmnopqrstuawyxv";
        String actual = runTimedTest(testString);

        assertThat(actual, is("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void shouldReturnTrueWhenLettersAreInOrder() {
        final String testString = "abcdefghijklmnop";
        String actual = runTimedTest(testString);

        assertThat(actual, is("in order"));
    }

    @Test
    public void shouldReturnTrueWhenNumbersAreInOrder() {
        final String testString = "1234";
        String actual = runTimedTest(testString);

        assertThat(actual, is("in order"));
    }

    @Test
    public void shouldReturnNewStringWhenNonAlphaNumericCharactersUsed() {
        final String testString = "I'm not in order!";
        String actual = runTimedTest(testString);

        assertThat(actual, is("   !'Ideimnnoorrt"));
    }

    private String runTimedTest(String testString) {
        final int loops = 1000;
        long[] times = new long[loops];

        for (int x = 0; x < loops; x++) {
            long start = System.nanoTime();
            target.solution(testString);
            long end = System.nanoTime();
            times[x] = end - start;
        }

        Arrays.sort(times);
        int y = 0;
        for (long time : times) {
            System.out.println(y++ + ": " + time);

        }

        long averageTime = 0;
        int standardDeviation = 300;
        for (int x = 0; x < loops - standardDeviation; x++) {
            averageTime += times[x];
        }

        System.out.println("Stats median: " + Statistics.computeMedian(times));
        System.out.println("Stats mode: " + Statistics.computeMode(times));
        System.out.println("Stats mean: " + Statistics.computeMean(times, 300L));
        System.out.println("StringOrderCheck Average Nanos: " + averageTime / (loops - standardDeviation));
        System.out.println(("Lowest: " + times[0] + " Highest: " + times[loops - 1]));
        return target.solution(testString);
    }
}
