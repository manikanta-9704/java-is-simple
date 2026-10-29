package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListShopingCart {

	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<>();
		Set<String> set=new HashSet<>();
		list.add("mouse");
		list.add("mobile");
		list.add("laptop");
		list.add("keybard");
		for(String product:list) {
			System.out.print("  "+product);
		}
		System.out.println();
		Iterator itr=list.iterator();
		for(String name:list){
			list.add("headset");
			list.remove("mouse");
			set.add(name);
			
		}
		
		
		for(String product:set) {
			System.out.print("  "+product);
		}

	}

}
