package com.bhami.coreJava.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapApp {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap("HashMap",hashMap);
		//testMap("linkedHashMap",hashMap);
		//testMap("TreeMap",hashMap);

	}
	
	private static void testMap(String type, Map<Integer, String> map){
		map.put(2,"Two");
		map.put(10,"Ten");
		map.put(5,"Five");
		
		map.put(9,"Nine");
		
		map.put(1,"One");
		map.put(7,"Seven");
		System.out.println("In type: " + type);
		
		//Iteration#1
		System.out.println("Oneway of traversing MAp");
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//Itreation2
		System.out.println("Oneway of traversing MAp");
		for(Entry<Integer, String> entry : map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
			
		}
	}
}
