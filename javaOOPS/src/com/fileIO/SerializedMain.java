package com.fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedMain {

	public static void main(String[] args) throws IOException{
				User u1=new User();
				u1.userName="mani";
				u1.password="qwerty";
				FileOutputStream fs=new FileOutputStream("C:\\Users\\manikanta\\Downloads\\javafileio\\demofile\\user.txt");//classnotfound exception
				ObjectOutputStream os=new ObjectOutputStream(fs);//Unhandled exception type IOException
				os.writeObject(u1);
		os.close();
			}


	}
