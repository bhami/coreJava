package com.bhami.coreJava.thread;

public class NumberPrint implements Runnable {
	 
    public void run() {
 
        for (int i = 1; i <= 5; i++) {
 
            System.out.println(i);
 
            try {
 
                Thread.sleep(2000);
 
            } catch (InterruptedException ex) {
                System.out.println("I'm interrupted");
            }
        }
    }
 
    public static void main(String[] args) {
        Runnable task = new NumberPrint();
        Thread thread = new Thread(task);
        thread.start();
    }
}