package com.bhami.coreJava.thread.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Message> queue;
	
	
	public Producer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		//produces messages
		for (int i=0; i <100; i++){
			Message msg = new Message("" +i);
			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced " + msg.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Adding exit message
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
