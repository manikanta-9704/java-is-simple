package com.exceptionhandling;

import java.util.Scanner;

public class Demo1 {
//arithmatic exception
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	static int divide(int a,int b) {
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(divide(num1,num2));

	}

}
