package com.bhami.coreJava;

public class Cricketer {
	
	
	public static void main(String[] args) {
		
		/*
		//Testing boolean
		boolean isTrue = false;
		if(isTrue == true)
			System.out.println("True True..");
		if(isTrue = true){
			System.out.println("True..");
		}
		*/
		
		// enhanced for loop
		int[] number = {1, 2, 5, 3, 8};
		for(int i: number){
			System.out.println(i);
		}
		for(;;){
			System.out.println("loop will be executed endlessly");
		}
		
	}

}
