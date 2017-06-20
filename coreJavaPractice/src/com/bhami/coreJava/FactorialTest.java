package com.bhami.coreJava;

import java.util.Scanner;

public class FactorialTest {
	static int result = 1 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to get factorial");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Input is :" + number);
		result = calculateFactorial(number);
		System.out.println("Factorial of " + number + " = " + result);
		
		sc.close() ;
	}
	public static int calculateFactorial(int input){
		for(int i = 2; i<=input; i++){
			result *= i;
			//System.out.println("result at i=" + i + " : " + result);
		}
		return result;
	}

}
