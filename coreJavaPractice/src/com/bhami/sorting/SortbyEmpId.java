package com.bhami.sorting;

import java.util.Comparator;

public class SortbyEmpId implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2){
		return emp1.getEmpId() - emp2.getEmpId();
	}
}
