package com.code.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackspacesInString {

  public String solution(final String input) {

    List<Character> runningChars = new ArrayList<>();
    final char[] chars = input.toCharArray();

    for (int x = 0; x < chars.length; x++) {
      if (chars[x] == '#') {
        if (x > 0 && runningChars.size() > 0) {
          runningChars.remove(runningChars.size() - 1);
        }
      } else {
        runningChars.add(chars[x]);
      }
    }

    return runningChars.stream().map(c -> c.toString()).collect(Collectors.joining());
    //teste
  }
}
