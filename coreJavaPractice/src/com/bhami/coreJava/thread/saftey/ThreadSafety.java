package com.bhami.coreJava.thread.saftey;

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {
		
		ProcessingThread pt = new ProcessingThread();
		Thread t1 = new Thread(pt,"t1");
		t1.start();
		
		
		Thread t2 = new Thread(pt,"t2");
		t2.start();
		
		//wait for the thread to sinish processing
		t1.join();
		t2.join();
		
		System.out.println("Processing Count " + pt.getCount());
		
		
	}

}

class ProcessingThread implements Runnable {
	private int count;
	@Override
	public void run() {
		for (int i=0; i<5; i++){
			processSomething(i);
			System.out.println("count :" + count + "Current Thread : " + Thread.currentThread().getName());
			count++;
		}
	}
		
	public int getCount(){
		return count;
	}
		
	private void processSomething(int i){
		//process some job
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


