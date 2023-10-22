package com.code.challenge;

public class BoiledEggs {

  public static int solution(int numberOfEggs) {
    int sessions = numberOfEggs / 8;

    sessions = numberOfEggs % 8 == 0 ? sessions : sessions + 1;

    return sessions * 5;
  }
}
