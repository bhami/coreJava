package com.bhami.coreJava.thread.daemon;

public class JavaDameonThread {

	public static void main(String[] args) throws InterruptedException {
		Thread dt = new Thread(new DaemonThread(), "dt1");
		dt.setDaemon(true);
		dt.start();
		//continue program
		Thread.sleep(30000);
		System.out.println("Finishing Program");

	}

}
 class DaemonThread implements Runnable {

	@Override
	public void run() {
		while (true){
			processSomething();
		}
	}
	
	private void processSomething(){
		System.out.println("Processing Daemon Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
