package com.gfs.backspaceinstring;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.gfs.backspaceinstring.benchmark.RandomStringUtil;

public class BackspacesInStringTest {

    BackspacesInString target;

    @Before
    public void setup() {
        target = new BackspacesInString();
    }

    @Test
    public void shouldReturnGivenStringWhenNoHashFound() {
        final String input = RandomStringUtil.replaceRandomString("abcdefg hi*$90@");
        final String expected = leadingSolution(input);

        assertThat(target.solution(input), is(expected));
    }

    @Test
    public void shouldProcessHashAsBackspace() {
        final String input = RandomStringUtil.replaceRandomString("abc#d#c");
        final String expected = leadingSolution(input);

        assertThat(target.solution(input), is(expected));
    }

    @Test
    public void shouldProcessMultipleConsecutiveHashsAndReturnEmptyString() {
        final String input = RandomStringUtil.replaceRandomString("abc##d######");
        final String expected = leadingSolution(input);

        assertThat(target.solution(input), is(expected));
    }

    @Test
    public void shouldProcessStringOfAllHashsAndReturnEmptyString() {
        final String input = RandomStringUtil.replaceRandomString("########");
        final String expected = leadingSolution(input);

        assertThat(target.solution(input), is(expected));
    }

    private String leadingSolution(final String testString) {
        final char[] buffer = testString.toCharArray();
        final int len = buffer.length;
        int writePos = 0;

        char c = 0;
        for (int i = 0; i < len; i++) {
            c = buffer[i];
            if (c == '#') {
                if (writePos > 0) {
                    writePos--;
                }
            } else {
                buffer[writePos] = c;
                writePos++;
            }
        }

        return new String(buffer, 0, writePos);

    }
}