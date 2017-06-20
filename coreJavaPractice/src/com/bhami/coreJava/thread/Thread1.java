package com.bhami.coreJava.thread;

public class Thread1 extends Thread {
		    public void run() {
	        System.out.println("My name is: " + getName());
	    }
	 
	    public static void main(String[] args) throws InterruptedException {
	        Thread1  t1 = new Thread1();
	        t1.start();
	        t1.join();
	 
	        System.out.println("My name is: " + Thread.currentThread().getName());
	    }
	 
	}
	
