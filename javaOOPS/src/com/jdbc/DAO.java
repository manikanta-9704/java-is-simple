package com.jdbc;

import com.jdbc.model.Employee;

public interface DAO {
String addEmployee(int id,Employee e);
String deleteEmployeeById(int id);
Boolean getById();
String updateById();
}
