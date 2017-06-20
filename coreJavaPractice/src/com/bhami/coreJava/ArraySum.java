package com.bhami.coreJava;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Pushing new changes");
		System.out.println("Doing array sum");
		StringBuilder sb = new StringBuilder();
		
		int out = 11;
		int iteration = 0;
		int found = 0;
		int[] inputArray = {2, 3, 6, 4, 8, 1, 0, 9, 2};
		int len = inputArray.length;
		for(int i=0; i<len; i++){
			for(int j= i+1; j<len; j++){
				int sum = inputArray[i] + inputArray[j];
				if (sum == out){
					System.out.println("Found a pair (" + inputArray[i] + "," + inputArray[j] +")" );
					found++;
				}
			}
			iteration++;
		}
		System.out.println("no of iteration : " +iteration);
		if (found != 0)
			System.out.println("Found :" + found + " pairs");
		else
			
			System.out.println("Found :" + found + " pairs");
		
	}
}