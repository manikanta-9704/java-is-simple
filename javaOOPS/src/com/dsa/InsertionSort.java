package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter arraylength: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("unsorted array: " +Arrays.toString(arr));
		int temp=0;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) { //if both conditions are true it checks until the least element reaches to 0th index
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println("sorted array: "+Arrays.toString(arr));
sc.close();
	}

}
