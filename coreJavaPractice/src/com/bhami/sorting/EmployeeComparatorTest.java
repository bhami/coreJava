package com.bhami.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1,"Bhami", 43, 1000);
		Employee emp2 = new Employee(3,"Sami", 44, 100);
		Employee emp3 = new Employee(2,"Bhanu", 40, 5000);
		Employee emp4 = new Employee(6,"Sanu", 45, 100000);
		Employee emp5 = new Employee(7,"Satish", 42, 6000);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		// UnSorted List
        System.out.println("Unsorted List : " + empList);
 
        Collections.sort(empList, new SortByEmpName());
        // Sorted by Employee Name
        System.out.println("Sorted by Name : " + empList);
 
        Collections.sort(empList, new SortbyEmpId());
        // Sorted by Emp Id
        System.out.println("Sorted by Emp ID : " + empList);
 
        Collections.sort(empList, new SortByEmpAge());
        // Sorted by age
        System.out.println("Sorted by Employee Age : " + empList);

	}

}
