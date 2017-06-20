package com.bhami.fileIO;

public class Java8_1 {

	public static void main(String[] args) {
		System.out.println("Testing basic lambda expression");
		//Annonymous Runnable
		Runnable r1 = new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello World one");
			}
		};
		
		//Lambda Runnable
		Runnable r2 = ()-> System.out.println("Hello World two");
		
		//Run em!
		r1.run();
		r2.run();
		
	}

}
