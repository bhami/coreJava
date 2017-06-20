package com.bhami.coreJava.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class GoogleSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selection = 8;
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(6);
		input.add(4);
		input.add(3);
		input.add(2);
		
		ListIterator<Integer> iter = input.listIterator();
		while(iter.hasNext()){
			int tmp = iter.next();
		    iter.remove();
			for(int i: input){
				int sum = (i + tmp);
				if(sum == 8){
					System.out.print("got the match");
					break;
				}
			}
		}
		
	}
}


