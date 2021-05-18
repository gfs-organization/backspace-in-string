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
        String actual = target.solution(testString);

        assertThat(actual, is("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void shouldReturnTrueWhenLettersAreInOrder() {
        final String testString = "abcdefghijklmnop";
        String actual = target.solution(testString);

        assertThat(actual, is("in order"));
    }

    @Test
    public void shouldReturnTrueWhenNumbersAreInOrder() {
        final String testString = "1234";
        String actual = target.solution(testString);

        assertThat(actual, is("in order"));
    }

    @Test
    public void shouldReturnNewStringWhenNonAlphaNumericCharactersUsed() {
        final String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore "
                + "magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis "
                + "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat "
                + "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String actual = target.solution(testString);

        assertThat(actual, is("                                                                    ,,,,..."
                + ".DELUaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"
                + "fffggghiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiilllllllllllllllllllllmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnn"
                + "ooooooooooooooooooooooooooooopppppppppppqqqqqrrrrrrrrrrrrrrrrrrrrrrsssssssssssssssssstttttttttttttttttttttttttttttttt"
                + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuvvvxxx"));
    }

}
