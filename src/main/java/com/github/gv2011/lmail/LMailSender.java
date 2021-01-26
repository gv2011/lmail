package com.github.gv2011.lmail;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

public final class LMailSender {
  
  private static final Logger LOG = getLogger(LMailSender.class);
  
  public void send(String message, String recipient){
    LOG.info("Sent message to {}.", recipient);
  }

}
