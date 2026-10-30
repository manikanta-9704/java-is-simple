package com.strings;
//String is a index based collection of charecters denoted in ""
//String is immutable 
public class StringDemo1 {

	public static void main(String[] args) {
		//object is created in string constant pool
		//hashcode->724542711
		String s1="hello";
		//when there is a two variables are contains to the same string litaral both the reference to the same object 
		//498931366
		String s2="java";
		//498931366
		String s3="java";
		//here two objects are going to be create 1-->heap area  2-->scp
//		hashcode-->2060468723
		String s4=new String("java is simple");
		//hashcode-->622488023
		String s5=new String("java is simple");//here only one object is created
		//hashcode-->1933863327
		String s6=new String("java");
		String s7="java is robust";
		String s8=new String(s7);//create object in heap
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));

	}

}
