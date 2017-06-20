package com.bhami.coreJava.thread;

public class ThreadInterrupExample implements Runnable {
	 
    public void run() {
        for (int i = 1; i <= 150; i++) {
            System.out.println("This is message #" + i);
            if (Thread.interrupted()) {
                System.out.println("I'm about to stop");
                return;
            }
 /*
            try {
                Thread.sleep(2000);
                continue;
            } catch (InterruptedException ex) {
                System.out.println("I'm resumed");
                //return;
            }
 */
        }
    }
 
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadInterrupExample());
        t1.start();
 
        try {
            Thread.sleep(10);
            t1.interrupt();
            //Thread.interrupted();
 
        } catch (InterruptedException ex) {
            System.out.println("I am at Interuptted exception handle");
        }
 
    }
}