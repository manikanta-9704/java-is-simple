package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.model.Employee;
import com.jdbc.utility.JdbcConnection;

public class DAOimplementation implements DAO {
  Connection con;
	@Override
	public String addEmployee(int id, Employee e) {
		try { 
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
			System.out.println("ststement executed");
			pst.setInt(1, id);
			pst.setString(2, e.getName());
			pst.setDouble(3,e.getSalary());
			pst.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return "record inserted";
	}

	@Override
	public String deleteEmployeeById(int id) {
		try {
			PreparedStatement pst=con.prepareStatement("delete employee where id=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean getById() {
		
		return null;
	}

	@Override
	public String updateById() {
		// TODO Auto-generated method stub
		return null;
	}

	

	}
