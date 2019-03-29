package com.cg.practicedemo.dao;

import java.util.HashMap;
import java.util.List;

import com.cg.practicedemo.bean.Employee;
import com.cg.practicedemo.exception.EmployeeException;

public interface EmployeeDao {

	public Employee addEmployee(Employee emp);
	public HashMap<Integer,Employee> showAllEmployees()throws EmployeeException;
	public List<Employee> deleteEmployee(int id) throws EmployeeException;
}
