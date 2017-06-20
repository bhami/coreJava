package com.bhami.coreJava.thread.wait_notify;

public class Waiter implements Runnable {
	private Message msg;
	
	public Waiter(Message m){
        this.msg=m;
    }

	@Override
	public void run() {
		System.out.println("Waiting for message object");
		String name = Thread.currentThread().getName(); 
		System.out.println("Thread name " +  name);
		synchronized(msg){
			try {
				System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
		}
	}

}
