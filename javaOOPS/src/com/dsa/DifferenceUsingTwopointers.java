package com.dsa;

import java.util.Arrays;

//Problem 6: Find Pair with Given Difference
//
//Find two elements whose difference equals the given value.
//
//Input:
//
//int[] arr = {1, 3, 5, 8, 10, 12};
//int difference = 5;
//
//Expected Output:
//
//3 and 8
//
//Requirements:
//
//Use two pointers.
//Avoid using nested loops.
public class DifferenceUsingTwopointers {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 10, 12};
		int difference = 5;
		Arrays.sort(arr);
		int start=0;
		int end=1;
		int diff=0;
		boolean status=false;
	while(start<end) {
		diff=arr[end]-arr[start];
		if(diff==difference) {
			System.out.println(start+"and"+end);
			status=true;
			start++;
			end--;
		}if(diff<difference) {
			end++;
		}else {
			start++;
			if(start==end) {
				end++;
			}
		}
		
	}if(!status) {
		System.out.println("no diff found");
	}

	}

}
