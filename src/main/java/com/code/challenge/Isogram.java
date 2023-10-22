package com.code.challenge;

public class Isogram {

  public static boolean isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  }

  public static boolean isIsogram2(String str) {
    byte[] bytes = str.toLowerCase().getBytes();

    for (int x = bytes.length - 1; x > -1; x--) {
      for (int y = x - 1; y > -1; y--) {
        if (bytes[x] == bytes[y]) {
          return false;
        }
      }
    }
    return true;
  }

}
