package com.exceptionhandling;

public class Demo3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);//arithametic exception
			System.out.println(0/0.0);//NaN
			System.out.println(0.0/0);//NaN
		}finally {
			System.out.println("hello");
		}
		}

	}

