package com.dsa;

import java.util.Scanner;

public class PrefixRangeSum {

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
		System.out.println("enter range ");
		int left=sc.nextInt();
		int right=sc.nextInt();
		int sum=0;
		if(right>arr.length) {
			System.out.println("range exeeds");
		}
		else if(left==0) {
			sum=prefix[right];
		}else {
			sum=prefix[right]-prefix[left-1];
		}
		System.out.print("prefix range sum:"+sum);
sc.close();
	}

}
