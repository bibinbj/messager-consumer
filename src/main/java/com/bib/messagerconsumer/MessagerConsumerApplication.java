package com.bib.messagerconsumer;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MessagerConsumerApplication {
	


	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(MessagerConsumerApplication.class, args);
		MessageListener listener = context.getBean(MessageListener.class);
		listener.getLatch().await(10000, TimeUnit.MILLISECONDS);
	}

}
