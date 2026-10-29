package com.dsa.infosyscodinground;

import java.lang.reflect.Array;
import java.util.Arrays;

/*---->There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subject to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute the candies to the children.<--------*/
public class CandySum {
static int candy(int[] rating) {
	int sum=0;
	int[] candy=new int[rating.length];
	Arrays.fill(candy,1);
	
//	--->lefy to right greedy
	
	for(int i=1;i<candy.length;i++){
		if(rating[i]>rating[i-1]) {
			candy[i]=candy[i-1]+1;
		}
		
	}
	
	//--->right to left greedy
	
	for(int i=rating.length-2;i>=0;i--) {
		if(rating[i]>rating[i+1]) {
			candy[i]=Math.max(candy[i], candy[i+1]+1);
		}
	}
	for(int num:candy) {
		sum+=num;
	}
	return sum;
}
	public static void main(String[] args) {
	int[] ratings= {1,3,2,4};
	System.out.println(ratings.length);
System.out.println(candy(ratings));
	}

}
