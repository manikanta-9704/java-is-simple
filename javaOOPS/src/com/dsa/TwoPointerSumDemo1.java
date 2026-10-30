package com.dsa;
//two pointer sum using bruteforce methodology
public class TwoPointerSumDemo1 {

	public static void main(String[] args) {
		int []arr= {2,4,3,6,4,12,6};
		int target=8;
		//time complexity is O(n)
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
