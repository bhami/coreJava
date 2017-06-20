package com.bhami.coreJava.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(20);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		//Itreation #1 to retrieve ArrayList
		System.out.println("\nItreation#1 to get arraylist");
		for (int i=0; i<arrayList.size(); i++){
			System.out.println("At Index[ " +i +" ]:" + arrayList.get(i));
		}
		
		//Itreation#2 to retrieve ArrayList
		System.out.println("\nItreation#2 to get arraylist");
		for(int i : arrayList){
			System.out.println( i);
		}
		
		System.out.println("\nItreation#1 to remove arraylist");
		System.out.println("ENter the index from 0 to " +(arrayList.size()-1));
		//InputStream i = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String input;
		try {
			input = br.readLine();
			int index = Integer.parseInt(input);
			System.out.println("removing arraylist at index "+ index );
			arrayList.remove(index);
			System.out.println("After removing ");
			for(int i : arrayList){
				System.out.println( i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
