package com.collections;

import java.util.List;
import java.util.Stack;

public class TestStackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> num =new Stack<>();
		num.push(10);
		num.push(20);
		num.push(30);
		num.push(40);
		num.push(20);
		num.push(50);
		System.out.println(num);
		System.out.println(num.search(20));
		num.remove(Integer.valueOf(20));
		//pop() remove top most element and return that element
		int num1=num.pop();
		System.out.println(num1);
		System.out.println(num);

	}

}
