package com.exceptionhandling;

public class Employee {
String userName;
String email;
String password;
int count=0;
Employee[] emp=new Employee[10];

public Employee(String userName, String email, String password) {
	super();
	this.userName = userName;
	this.email = email;
	this.password = password;
}
void addEmployee(Employee e) {
	emp[count]=e;
	count++;
	System.out.println("employee added");
}
void employeeShow() {
	for(int i=0;i<count;i++) {
		emp[i].display();
	}
	
}
void display() {
	System.out.println("user name"+userName);
	System.out.println("email:"+email);
	System.out.println("password:"+password);
}

}
