package com.bhami.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPairSumTest {
	@SuppressWarnings("resource")
	public static void main(String[] args){
			System.out.println("Enter number of elements in the array  :");
			int elementCnt = new Scanner(System.in).nextInt();
			System.out.println("Enter the number X for the sum :\n");
			int sumInput = new Scanner(System.in).nextInt();
			System.out.println("\n");
			System.out.println("Generating array of " + elementCnt + " integers randomly from 1 to 10");
			int[] inputArray = new int[elementCnt];
			System.out.print("Input Array is : ");
			for (int i=0; i<elementCnt; i++){
				inputArray[i] = (int)(Math.random()*10);
			
			}
			System.out.print(Arrays.toString(inputArray));
			ArrayPairSum(inputArray, sumInput);
	}
	
		
	public static  void ArrayPairSum(int inputArray[], int sumNumber){
			int found = 0;
			int len = inputArray.length;
			for(int i=0; i<len; i++){
				for(int j= i+1; j<len; j++){
					int sum = inputArray[i] + inputArray[j];
					if (sum == sumNumber){
						System.out.println("\nFound a pair (" + inputArray[i] + "," + inputArray[j] +")" );
						found++;
					}
				}	
			}
			if (found == 0)
				System.out.println("No Pair found\n");
			
	}
}


