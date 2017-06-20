package com.bhami.coreJava.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<String>();
		if (set1.isEmpty())
			System.out.println("Set1 is empty at start");
		set1.add("Bhami");
		set1.add("Satish");
		set1.add("Rahul");
		set1.add("Priya");
		
		for (String element: set1){
			System.out.println(element);
			
		}
		if (set1.contains("Bhami"))
			System.out.println("Contains Bhami");
		
		Set<String> intersection = new TreeSet<String>();
		intersection.add("Bhami");
		intersection.add("Sami");
		intersection.add("Atul");
		intersection.add("Priyanka");
		intersection.add("vikki");
		
		for (String element: intersection){
			System.out.println(element);
		}
		Set<String> set2 = new TreeSet<String>(intersection);
		System.out.println("elements of set2 :" + set2);
		intersection.retainAll(set1);
		System.out.println(intersection);
		
		//Difference
		Set<String>difference = new TreeSet<String>(set2);
		System.out.println("elements of set2 :" + difference);
		difference.removeAll(set1);
		System.out.println("differnce of set2-set1 : " + intersection);
		
		
	}

}
