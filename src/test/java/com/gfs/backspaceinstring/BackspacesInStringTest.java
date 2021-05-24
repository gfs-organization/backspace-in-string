package com.gfs.backspaceinstring;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BackspacesInStringTest {

    BackspacesInString target;

    @Before
    public void setup() {
        target = new BackspacesInString();
    }

    @Test
    public void shouldReturnGivenStringWhenNoHashFound() {
        final String input = "abcdefg hi*$90@";
        assertThat(target.solution(input), is(input));
    }

    @Test
    public void shouldProcessHashAsBackspace() {
        final String input = "abc#d#c";
        assertThat(target.solution(input), is("abc"));
    }

    @Test
    public void shouldProcessMultipleConsecutiveHashsAndReturnEmptyString() {
        final String input = "abc##d######";
        assertThat(target.solution(input), is(""));
    }

    @Test
    public void shouldProcessStringOfAllHashsAndReturnEmptyString() {
        final String input = "########";
        assertThat(target.solution(input), is(""));
    }
}