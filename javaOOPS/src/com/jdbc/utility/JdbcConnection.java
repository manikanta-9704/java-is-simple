package com.jdbc.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	static Connection con;
	public static Connection connection() {
	try {
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","atchutarao");
		
	}catch(Exception e) {
		System.out.println(e);
	}
	return con;
	
	}

}
