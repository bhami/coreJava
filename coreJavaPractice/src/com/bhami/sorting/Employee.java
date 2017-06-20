package com.bhami.sorting;

public class Employee {
    private int empId;
    private String empName;
    private int age;
    private int salary;
 
    public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, int age, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }
 
    public int getEmpId() {
        return empId;
    }
 
    public void setEmpId(int empId) {
        this.empId = empId;
    }
 
    public String getEmpName() {
        return empName;
    }
 
    public void setEmpName(String empName) {
        this.empName = empName;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String toString() {
        return "Employee : " + empId + " - " + empName + " - " + age + " - " + salary;
    }
}
