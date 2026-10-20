package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsDemo1 {
public static void main(String[] args) {
	Collection list=new ArrayList<>();
	list.add(10);
	list.add("hello");
	System.out.println(list);
	List list1=new ArrayList<>();
	list1.addAll(list);
	list1.add(1,2);
	list1.add("how are you");
	System.out.println(list1);
	
}
}
