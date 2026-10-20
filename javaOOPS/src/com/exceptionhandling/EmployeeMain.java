package com.exceptionhandling;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String uName=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		Employee e1=new Employee(uName,email,password);
		e1.addEmployee(e1);
		e1.employeeShow();
sc.close();
	}

}
