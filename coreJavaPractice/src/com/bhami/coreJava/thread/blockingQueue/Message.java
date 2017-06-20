package com.bhami.coreJava.thread.blockingQueue;

public class Message {
	private String message;
	
	public Message(String msg){
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
