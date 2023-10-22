package com.code.challenge.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.code.challenge.RedoBackspaceInString;
import org.junit.jupiter.api.Test;

class RedoBackspaceInStringTest {

  @Test
  void whenGivenAStringWithHashes_returnTheRemainingStringAfterProcessingBackspaces() {
    final String target = "abc#d##c";
    final String expected = "ac";

    final RedoBackspaceInString redoBackspaceInString = new RedoBackspaceInString();
    final String actual = redoBackspaceInString.solution(target);

    assertEquals(expected, actual);
  }

}