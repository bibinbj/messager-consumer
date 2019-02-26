package com.bib.messagerconsumer;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {
	
	private CountDownLatch latch = new CountDownLatch(1);
	
	 public CountDownLatch getLatch() {
		    return latch;
		  }
	
	@KafkaListener(topics = "test", groupId = "testgp")
	public void listen(String message) {
	    System.out.println("Received Messasge in group testgp: " + message);
	}

}
