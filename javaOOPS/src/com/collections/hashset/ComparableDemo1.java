package com.collections.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Products implements Comparable<Products>{
	Integer id;
	String name;
	Double price;
	public Products(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ","
				+ " name=" + name + ", "
						+ "price=" + price + "]";
	
	}
	@Override
	public int compareTo(Products other) {
		//--->based on price
//		return Double.compare(this.price,other.price);
//		if(this.price<other.price) {
//			return -1;
//		}
//		else if(this.price>other.price) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
		//based on product name
		return this.name.compareTo(other.name);
	}
	
	
}
public class ComparableDemo1 {

	public static void main(String[] args) {
		List<Products> list=new ArrayList<>();
		Products p4=new Products(101,"vivo",50000.0);
		Products p3=new Products(102,"realme-mobile",45000.0);
		Products p2=new Products(103,"mac-book",120000.0);
		Products p1=new Products(104,"dell-inspiron",580000.0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Collections.sort(list);
		for(Products p:list) {
		System.out.println(p);
		}
		
		
		

	}

}
