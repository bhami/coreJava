package com.bhami.coreJava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




	

 class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private int age;
	
	public String getStudentName(){
		return name;
	}
	
	public Student(int rollNo, String name, int age){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age
				+ "]";
	}

	//@Override
	public int compareTo(Student stObj1) {
		if(age == stObj1.age)
			return 0;
		else if(age > stObj1.age)
			return 1;
		else
			return -1;
	}
}
public class StudentSort {
	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(2,"Bhami",45));
		a1.add(new Student(3,"Priya",15));
		a1.add(new Student(1,"Satish",55));
		a1.add(new Student(1,"Rahul",11));
		a1.add(new Student(5,"Priyanka",46));
		System.out.println("Before sort : ");
		/////before java5 used Iterator to traverseing
		Iterator<Student> i1 = a1.iterator();
		
		while(i1.hasNext()){
			Student value = i1.next();
			if (value.getStudentName().equals("Priyanka")){
				System.out.println("Removing : " + value);
				i1.remove();
			}
			
		}
		System.out.println("List of students after removing : ");
		
		for(Student st1 : a1){
			System.out.println(st1.toString());
		}	
		
		Collections.sort(a1);
		System.out.println("After sort : ");
		for(Student st2 : a1){
			System.out.println(st2.toString());
		}
	}
}


	



