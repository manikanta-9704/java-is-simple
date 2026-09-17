package com.exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("hello");
		try{
			int[] arr= new int[3];
			arr[0]=9;
			arr[1]=4;
			arr[2]=4;
			arr[3]=5;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				System.out.println("continue");//this line wont execute 
			}
		}catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main method ended");

	}

}
