package com.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
	int id;
	String name;
	Double salary;
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
	}
	
//	Comparator<Employee1> emp=new Comparator<>() {
//		public int compare(Employee1 e1,Employee1 e2){
//			return e1.salary.compareTo(e2.salary);
//			
//		}
//	}
	public static Comparator<Employee1> emp= new Comparator<>() {

		@Override
		public int compare(Employee1 o1, Employee1 o2) {
			
			return o1.salary.compareTo((o2.salary));
//			return 0;
		}
	};
	
	
}
public class CompatratorDemo {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(101,"mani",600000.00);
		Employee1 e2=new Employee1(102,"vivek",80000.00);
		Employee1 e3=new Employee1(103,"abhi",650000.00);
		Employee1 e4=new Employee1(104,"lucky",670000.00);
		List<Employee1> list=new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Employee>)
//		the class must implement the comparable interface
//		
//		Collections.sort(list, Employee1.emp);
//
//		This method accepts a Comparator that defines how two employees should be compared.
		Collections.sort(list,Employee1.emp);
		for(Employee1 data:list) {
		System.out.println(data);
		

	}
	}
}

