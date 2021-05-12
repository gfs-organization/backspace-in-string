package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

        long standardDeviation = 300L;
        System.out.println("********    StringOrderCheck Stats median: " + Statistics.computeMedian(times));
        System.out.println("********    StringOrderCheck Stats mode: " + Statistics.computeMode(times));
        System.out.println(
                "********    StringOrderCheck Stats mean: " + Statistics.computeMean(times, standardDeviation) + " with Standard Deviation of "
                        + standardDeviation);
        System.out.println("********    StringOrderCheck Range: " + times[0] + " to " + times[loops - 1]);

        return target.solution(testString);
    }
}
