package com.dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {4,5,6,3,1};
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

	}

}
