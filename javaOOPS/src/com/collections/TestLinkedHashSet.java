package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;
//linkedhashset follows insertion order 
//it wont allows duplicate values
//internally t impliments the linkedhashmap
public class TestLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(10);
		System.out.println(set);

	}

}
