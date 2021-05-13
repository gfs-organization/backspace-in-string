package com.gfs.codechallenge;

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
        String actual = target.jeremySolution(testString);

        assertThat(actual, is("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void shouldReturnTrueWhenLettersAreInOrder() {
        final String testString = "abcdefghijklmnop";
        String actual = target.jeremySolution(testString);

        assertThat(actual, is("in order"));
    }

    @Test
    public void shouldReturnTrueWhenNumbersAreInOrder() {
        final String testString = "1234";
        String actual = target.jeremySolution(testString);

        assertThat(actual, is("in order"));
    }

    @Test
    public void shouldReturnNewStringWhenNonAlphaNumericCharactersUsed() {
        final String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore "
                + "magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis "
                + "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat "
                + "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String actual = target.jeremySolution(testString);

        assertThat(actual, is("                                                                    ,,,,..."
                + ".DELUaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"
                + "fffggghiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiilllllllllllllllllllllmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnn"
                + "ooooooooooooooooooooooooooooopppppppppppqqqqqrrrrrrrrrrrrrrrrrrrrrrsssssssssssssssssstttttttttttttttttttttttttttttttt"
                + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuvvvxxx"));
    }

    private String runTimedTest(String testString) {
        StringOrderCheck target = new StringOrderCheck();
        final int loops = 1000;
        long[] times = new long[loops];

        for (int x = 0; x < loops; x++) {
            long start = System.nanoTime();
            target.jeremySolution(testString);
            long end = System.nanoTime();
            times[x] = end - start;
        }

        int standardDeviation = 30;
        System.out.println("********    StringOrderCheck Stats median: " + Statistics.computeMedian(times));
        System.out.println("********    StringOrderCheck Stats mode: " + Statistics.computeMode(times));
        System.out.println(
                "********    StringOrderCheck Stats mean: " + Statistics.computeMean(times, standardDeviation) + " with Standard Deviation of "
                        + standardDeviation + "%");
        System.out.println("********    StringOrderCheck Range: " + times[0] + " to " + times[loops - 1]);

        return target.solution(testString);
    }
}
