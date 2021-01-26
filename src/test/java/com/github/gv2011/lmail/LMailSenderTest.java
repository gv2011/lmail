package com.github.gv2011.lmail;

import org.junit.Test;

public class LMailSenderTest {

  @Test
  public void test() {
    new LMailSender().send("Hello!", "bob@example.com");
  }

}
