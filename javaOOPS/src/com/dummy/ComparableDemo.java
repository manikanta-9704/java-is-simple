package com.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.salary) {
			return 1;
		}
		else if(this.salary<o.salary){
			return -1;
			
		}else {
		return 0;
		}
	}
	
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"mani",600000.00);
		Employee e2=new Employee(102,"vivek",80000.00);
		Employee e3=new Employee(103,"abhi",650000.00);
		Employee e4=new Employee(104,"lucky",670000.00);
		List<Employee> list=new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Employee>)
//		the class must implement the comparable interface
		Collections.sort(list);
		for(Employee data:list) {
		System.out.println(data);
		}

	}

}
