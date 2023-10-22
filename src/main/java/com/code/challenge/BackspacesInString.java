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

  public String solution2(final String input) {
    StringBuilder builder = new StringBuilder(input);
    final char[] chars = input.toCharArray();

    for (int x = chars.length - 1; x >= 0; x--) {
      if (chars[x] == '#') {
        builder.deleteCharAt(x);
        if (x > 0) {
          builder.deleteCharAt(x - 1);
        }
      }
    }

    return builder.toString();
  }

  public String solution3(final String testString) {
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

  public String solution4(final String testString) {
    final byte[] buffer = testString.getBytes();
    final int len = buffer.length;
    final byte hashByte = "#".getBytes()[0];
    int writePos = 0;

    byte c = 0;
    for (int i = 0; i < len; i++) {
      c = buffer[i];
      if (c == hashByte) {
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

  public String solution5(final String testString) {
    final byte[] buffer = testString.getBytes();
    final int lastIndex = buffer.length - 1;
    final byte hashByte = "#".getBytes()[0];
    int writePos = lastIndex;

    byte c = 0;
    int backspaceCount = 0;
    for (int i = lastIndex; i >= 0; i--) {
      c = buffer[i];
      if (c == hashByte) {
        backspaceCount++;
      } else {
        if (backspaceCount > 0) {
          backspaceCount--;
          continue;
        }
        buffer[writePos] = c;
        writePos--;
      }
    }

    return new String(buffer, writePos + 1, lastIndex - writePos);

  }
}
