package com.bhami.coreJava;

public class StringBuffer1 {
	
	public static String reverse(String input){
			String out= "";
			
		if (input == null || input.isEmpty())
			return input;
		for (int i=input.length()-1; i>=0; i--){
			out = out + input.charAt(i);
		}
		return out;
	}
	
	public static void main(String[] args) {
		/*
		String word = "Bhami";
		System.out.println("Input String : " + word);
	
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.println("Original String : " + word + " Reverse String :" + reverse);
		System.out.println("Another way to reverse the string is: ");
		
		 word = "Band";
		 System.out.println(" New Input String : " + word);
		 
		 reverse = reverse(word);
		System.out.println(reverse);
		
		
		//Testing array of string object
		
		String[] weekDay = new String[5];
		weekDay[0] = "Monday";
		weekDay[1] = "Tuesday";
		weekDay[2] = "Wednesday";
		weekDay[3] = "Thursday";
		weekDay[4] = "Friday";
		
		for (int i= 0; i< weekDay.length; i++){
			System.out.println("Weekday[" + i + "] =" + weekDay[i]);
			
		}
				
		//testing 2 dimensional int array
		
		
		int[][] data = {{2,4},
				{4,5},
				{8,9}};
		
		for (int row = 0; row < data.length; row++){
			for(int col=0; col<data[row].length; col++){
				System.out.println("value at data[" +row + "," + col + "]={" + data[row][col]);
			}
		}
		
	
	
		
		//Testing wherather string objects are immutable or not
		
		String s1 = "Bhami";
		String s2 = "Bhami";
		
		if(s1 == s2)
			System.out.println("String s1 and s2 are equal");
		else
			System.out.println("String s1 and s2 are not equal");
		
		String s3 = new String("Sami");
		String s4 = new String("Sami");
		
		if(s3 == s4)
			System.out.println(" New String s3 and s4 are equal");
		else
			System.out.println(" New String s3 and s4 are not equal");
		
		
		if (s3.equals(s4))
			System.out.println(" In equal method : New String s3 and s4 are equal");
		else
			System.out.println(" In equal method : New String s3 and s4 are not equal");
		
		
		*/
		
		//testing stringbuffer class
		StringBuffer sb1 = new StringBuffer("Hello My name is Bhami ");
		System.out.println("sb1: " + sb1);
		
		sb1.append("chaudhary/jain");
		
		System.out.println("new sb1: " + sb1);
		
		//get the input from commandline
		
		System.out.println("Enter the no of elements in array:");
		
		
 }	

}
