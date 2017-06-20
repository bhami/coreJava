package com.bhami.coreJava.thread.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService  {

	
	public static void main(String[] args) {
		//Creating Blockingqueue of size 10
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		//starting producer to produce message
		new Thread(producer).start();
		//starting consumer to consume message
		new Thread(consumer).start();
		System.out.println("Producer and consumer has started");
	}

}
