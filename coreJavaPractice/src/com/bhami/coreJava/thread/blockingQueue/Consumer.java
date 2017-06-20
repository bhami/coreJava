package com.bhami.coreJava.thread.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Message> queue;
	
	
	public Consumer(BlockingQueue<Message> queue) {
			this.queue = queue;
	}


	@Override
	public void run() {
		//Consume message until "exit" message is received
		Message msg;
		try {
			while((msg = queue.take()).getMessage() != "exit"){
				Thread.sleep(10);
				System.out.println("Consumed " + msg.getMessage());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
