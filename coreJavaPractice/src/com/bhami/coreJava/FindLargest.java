package com.bhami.coreJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindLargest {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This process  creates an array of given size and fills with random number");
			System.out.println("Eneter no of elements in array");
			input = br.readLine();
			int elementCnt = Integer.parseInt(input);
			int[] number = new int[elementCnt];
			for (int i=0; i<elementCnt; i++){
				number[i] = (int)(Math.random()*125 + Math.random()*100);
			//print all numbers in array
				System.out.println(number[i] + " ");
			}
			Arrays.sort(number);
			System.out.println("Sorted array:");
			System.out.println("Largest element in the array: " + number[elementCnt-1]);
			System.out.println("Second largest element in the array: " + number[elementCnt-2]);
			System.out.println("Smallest element in the array: " + number[0]);
			int middle = elementCnt/2;
			System.out.println("Middle element in the array: " + number[middle]);
			for(int num : number){
				System.out.println(num + " ");
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
