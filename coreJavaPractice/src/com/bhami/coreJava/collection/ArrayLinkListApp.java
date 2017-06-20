package com.bhami.coreJava.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkListApp {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		showTiming("ArrayList", arrayList);
		showTiming("LinkedList", linkedList);
	}
	private static void showTiming(String type, List<Integer> list){
		for (int i=0; i<1E5; i++){
			list.add(i);
		}
		System.out.println("Start time:");
		long start = System.currentTimeMillis();
		for (int i=0; i<1E5; i++){
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Total time taken by " + type + "  :" + (end-start) );
	}

}
