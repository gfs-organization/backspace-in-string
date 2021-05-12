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

        long averageTime = 0;
        for (int x = 1; x < loops; x++) {
            averageTime += times[x];
        }

        System.out.println("StringOrderCheck Average Nanos: " + averageTime / (loops - 1));
        return target.solution(testString);
    }
}
