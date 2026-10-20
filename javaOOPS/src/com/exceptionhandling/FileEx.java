package com.exceptionhandling;

import java.io.*;

//1.Create a Java program to create and open student.txt using FileInputStream. 
//If the file is not available, handle the Exception
public class FileEx {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\manikanta\\Downloads\\newone\\student.txt");
		FileInputStream fp=new FileInputStream("C:\\Users\\manikanta\\Downloads\\newone");
		int name=fp.read();
		System.out.println(name);

	}

}
