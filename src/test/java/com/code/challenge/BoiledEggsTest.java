package com.code.challenge;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class BoiledEggsTest {

  @Test
  void given0Eggs_shouldTake0Minutes() {

    int totalTime = BoiledEggs.solution(0);
    assertThat(totalTime, is(0));
  }

  @Test
  void given5Egss_shouldTake5Minutes() {
    int totalTime = BoiledEggs.solution(5);
    assertThat(totalTime, is(5));
  }

  @Test
  void given10Egss_shouldTake10Minutes() {
    int totalTime = BoiledEggs.solution(10);
    assertThat(totalTime, is(10));
  }

  @Test
  void given16Egss_shouldTake10Minutes() {
    int totalTime = BoiledEggs.solution(16);
    assertThat(totalTime, is(10));
  }
}