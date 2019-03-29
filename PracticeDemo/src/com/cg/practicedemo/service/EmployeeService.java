package com.cg.practicedemo.service;

import java.util.HashMap;
import java.util.List;

import com.cg.practicedemo.bean.Employee;
import com.cg.practicedemo.exception.EmployeeException;

public interface EmployeeService {

	public boolean validateEmpNo(int empId);
	public boolean validateEmpName(String empName);
	public boolean validateEmpSal(int empSal);
	public Employee addEmployee(Employee emp);
	public HashMap<Integer,Employee> showAllEmployees()throws EmployeeException;
	public List<Employee> deleteEmployee(int id) throws EmployeeException;
}
