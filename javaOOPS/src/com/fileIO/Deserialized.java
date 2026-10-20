package com.fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialized {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("C:\\Users\\manikanta\\Downloads\\javafileio\\demofile\\user.txt");
		ObjectInputStream os=new ObjectInputStream(fi);
		User u2=(User)os.readObject();
		System.out.println(u2.userName);
		System.out.println(u2.password);

	}

}
