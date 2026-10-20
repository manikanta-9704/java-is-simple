package com.exceptionhandling;

import java.util.Scanner;

public class UdefinedException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

UdefinedException( String msg){
	System.out.println("in valid age");
}
	
	public static void main(String[] args) throws  UdefinedException {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter age");
			int age=sc.nextInt();
			if(age<18) {
				throw new UdefinedException("invalid age");
			}else {
				System.out.println("registration success");
			}
			
		}catch(UdefinedException e) {
			
		}

	}

}
