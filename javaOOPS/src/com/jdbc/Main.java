package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.jdbc.model.Employee;

public class Main {
	public static void main(String[] args)throws Exception {

		//load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
		//establish the connection
		 Connection con = DriverManager.getConnection(
				    "jdbc:mysql://localhost:3306/jdbcdemo",
				    "root",
				    "atchutarao"
				);
		  System.out.println("connection established");

		
		//create statement object
//		Statement st=con.createStatement();
		Employee emp=new Employee();
//		emp.setId(2);
		emp.setName("suresh");
		emp.setSalary(50000);
		DAO dao=new DAOimplementation();
		String status=dao.addEmployee(2,emp);
		System.out.println(status);
		
//		//create resultset object
//		 String query = "SELECT * FROM employee";
//		
//
//	        ResultSet rs = st.executeQuery(query);
//	        System.out.println("quary executed");
//		//represent the resultset
//	        while (rs.next()) {
//
//	            System.out.println(
//	                    rs.getInt("id") + " "
//	                    + rs.getString("name") + " "
//	                    + rs.getDouble("salary")
//	            );
//	        }
//		//close the connection
//	        rs.close();
//	        st.close();
//	        con.close();

	}

}
