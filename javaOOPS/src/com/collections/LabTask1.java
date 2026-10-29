package com.collections;

import java.util.HashSet;
import java.util.Set;

//1.Write a Java program to count the number of vowels and consonants in a given string using a Set .
//Input: "hello world"
//Output: Vowels = 3, Consonants = 7

public class LabTask1 {

	public static void main(String[] args) {
		int vowels=0;
		int consonents=0;
	String s="javaissimple";
//	char c=s.charAt(0);
	char arr[]=s.toCharArray();
	Set set=new HashSet();
	for(char c1:arr) {
	set.add(c1);
	}
	
for(Object c2:set) {
	if(c2.equals('a') || c2.equals('e')|| c2.equals('i') || c2.equals('i')|| c2.equals('o')|| c2.equals('u')) {
	vowels+=1;
	}else {
		consonents+=1;
	}
	}
System.out.println("vowels count: "+vowels);
System.out.println("consonents count: "+consonents);

	}
	

}
