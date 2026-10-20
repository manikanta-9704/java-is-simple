package com.fileIO;

import java.io.File;
import java.io.IOException;

public class DemoFile {
	public static void main() throws IOException {
		File f=new File("C:\\Users\\manikanta\\Downloads\\javafileio\\demofile");
		if(!f.exists()) {
		f.mkdir();
		System.out.println("file created");
		}else {
			System.out.println("file already existed");
		}
		File f1=new File(f,"demodata.txt");
		f1.createNewFile();
		File f2=new File("C:\\Users\\manikanta\\Downloads\\javafileio");
		String[] files=f2.list();
		for(String file:files) {
			System.out.println(file);
			
		}
		
	}

}
