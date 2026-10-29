package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Demojdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbcdemo",
			    "root",
			    "atchutarao");
		Statement st=con.createStatement();
		st.executeUpdate("create table DummyTable(id int,name varchar(40))");
			System.out.println("table created");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
