package com.dsa;

public class SlidingWindowSum {

	public static void main(String[] args) {
	int []arr= {10,20,30,40,4,2,3};
	int window=3;
	int windowSum=0;
	double average=0;
	for(int i=0;i<window;i++) {
		windowSum+=arr[i];
	}
	average=windowSum/window;

	System.out.println("sum:"+windowSum+"average: "+average);
	for(int i=1;i<=arr.length-window;i++) {
		//arr[i+window-1];--->3,4,5,6 theese index values are added to windowsum for each loop
		//arr[i-1]--->0,1,2,4 theese values are removed from windowsum for each loop
		windowSum=windowSum-arr[i-1]+arr[i+window-1];
		average=windowSum/window;
		System.out.println("sum:"+windowSum+"average: "+average);
	}


	}

}
