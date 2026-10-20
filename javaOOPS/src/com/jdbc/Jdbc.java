package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.utility.JdbcConnection;

public class Jdbc {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
//		//load driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","atchutarao");
		Connection con=JdbcConnection.connection();
	PreparedStatement st =  con.prepareStatement("insert into students values(?,?,?)");
	st.setInt(1, 10);
	st.setString(2, "mani");
	st.setInt(3, 102);

//    int n=st.executeUpdate(quary);
	ResultSet rs=st.executeQuery("select * from students");
	while(rs.next()) {
		System.out.println(rs.getInt("id")
				+rs.getString("name")
				+rs.getInt("age"));
	}

	}

}
