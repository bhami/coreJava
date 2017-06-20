package com.bhami.coreJava.thread.wait_notify;

public class Notifier implements Runnable {

    private Message msg;
    
    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(5000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                msg.notifyAll();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}