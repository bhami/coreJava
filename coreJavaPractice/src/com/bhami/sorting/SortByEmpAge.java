package com.bhami.sorting;

import java.util.Comparator;

public class SortByEmpAge implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2){
		return emp1.getAge() - emp2.getAge();
	}
}
