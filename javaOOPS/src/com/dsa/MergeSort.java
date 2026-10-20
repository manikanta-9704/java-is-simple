package com.dsa;
import java.util.Arrays;

public class MergeSort {
	static void divide(int[] arr) {
		if(arr.length==1) {
			return;
		}
		int []left=new int[arr.length/2];
		int[] right=new int[arr.length-left.length];
		int i;
		for(i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++) {
			
			right[j]=arr[i++];
			
		}
		divide(left);
		System.out.println("left array"+Arrays.toString(left));
		divide(right);
		System.out.println("right array"+Arrays.toString(right));
		merge(left,right,arr);
	}
	static void merge(int[] l,int[] r,int[] arr) {
		int i=0;
		int j=0;
		int k=0;
		while(i<l.length&&j<r.length) {
			if(l[i]<r[j]) {
				arr[k++]=l[i++];
			}else {
				arr[k++]=r[j++];
			}
			
		}
		while(i<l.length) {
			arr[k++]=l[i++];
		}
		while(j<r.length) {
			arr[k++]=r[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr= {2,4,6,7,8};
		divide(arr);
		System.out.println("sorted arr:"+Arrays.toString(arr));

	}

}
