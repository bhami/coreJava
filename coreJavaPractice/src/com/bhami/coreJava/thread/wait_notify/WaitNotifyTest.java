package com.bhami.coreJava.thread.wait_notify;

public class WaitNotifyTest {

	public static void main(String[] args) {
	Message msg = new Message("Bhami is processing message using wait notify");
	// creating waiter1 object
	Waiter waiter1 = new Waiter(msg);
	new Thread(waiter1).start();
	//creating waiter2 object
	Waiter waiter2 = new Waiter(msg);
	new Thread(waiter2).start();
	//creating notify object
	Notifier notifier = new Notifier(msg);
	new Thread(notifier).start();
	
	}

}
