package com.exceptionhandling;

import java.util.Scanner;

public class CustomException extends Exception {
	CustomException(){
		System.out.println("password too weak");
	}

	public static void main(String[] args) throws  CustomException{
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter password");
			String psw=sc.next();
			if(psw.length()<8) {
			throw new CustomException();
			}else {
				System.out.println("password accepted");
			}
		}catch(CustomException c) {
			
		}

	}

}
