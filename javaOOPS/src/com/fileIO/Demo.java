package com.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("\"C:\\Users\\manikanta\\Downloads\\javafileio\\demofile\\demodata.txt");
try (Scanner sc = new Scanner(f)) {
	while(sc.hasNext()) {
		System.out.print(sc.nextLine());
	}
}
	}
}
