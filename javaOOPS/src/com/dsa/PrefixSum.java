package com.dsa;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array length:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		int [] prefix=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(int num:prefix) {
			System.out.println(num);
		}
	}

}
