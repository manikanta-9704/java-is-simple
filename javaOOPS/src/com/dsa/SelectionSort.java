package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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
		int count=0;
		int count1=0;
		int count2=0;
for(int i=0;i<arr.length-1;i++) {
	count1+=1;
	for(int j=i+1;j<arr.length;j++) {
		count2+=1;
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			count++;
		}
	}
	if(count==0) {
		break;
	}
}
System.out.println("1sr forloop: "+count1);
System.out.println("2nd forloop: "+count2);

System.out.println("sorted array"+Arrays.toString(arr));
sc.close();
	}

}
