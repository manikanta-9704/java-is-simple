package com.dsa;

import java.util.Arrays;

//using while loop
//This logic works correctly when the array is sorted in ascending order.
//
//Why?
//
//If the sum is smaller than the target, we increase start to get a potentially larger value.
//If the sum is greater than the target, we decrease end to get a potentially smaller value.
public class TwoPointerSumDemo2 {

	public static void main(String[] args) {
//		int []arr= {3,4,3,5,4,12,6};
//		int target=8;
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		int target = 6;
		int start=0;
		Arrays.sort(arr);
		int end=arr.length-1;
		boolean status=false;
		int sum=0;
		while(start<end) {
			sum=arr[start]+arr[end];
//			if(arr[start]+arr[end]==target) 
			if(sum==target){
				System.out.println(arr[start]+" "+arr[end]);
				status=true;
				start++;
				end--;
			}
			else if(sum<target) {
				start++;
			}else {
				end--;
			}
//			if(start>end) {
//				start++;
//			}else {
//				end--;
//			}
		}
		if(!status) {
			System.out.println("matching pain not found");
		}

	}

}
