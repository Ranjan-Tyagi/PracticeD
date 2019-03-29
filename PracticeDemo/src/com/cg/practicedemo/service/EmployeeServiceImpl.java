package com.cg.practicedemo.service;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.practicedemo.bean.Employee;
import com.cg.practicedemo.dao.EmployeeDao;
import com.cg.practicedemo.dao.EmployeeDaoImpl;
import com.cg.practicedemo.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public boolean validateEmpNo(int empId) {
		// TODO Auto-generated method stub
		String pattern = "[1-9]{1}[0-9]{2}";
		
		return Pattern.matches(pattern,""+empId);
	}

	@Override
	public boolean validateEmpName(String empName) {
		// TODO Auto-generated method stub
		String pattern = "[A-Z]{1}[a-z]{2,}";
		return Pattern.matches(pattern, empName);
	}

	@Override
	public boolean validateEmpSal(int empSal) {
		// TODO Auto-generated method stub
		String pattern = "[1-9]{1}[0-9]{2,5}";
		return Pattern.matches(pattern, empSal+"");
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	@Override
	public HashMap<Integer, Employee> showAllEmployees()throws EmployeeException{
		// TODO Auto-generated method stub
		return dao.showAllEmployees();	}

	@Override
	public List<Employee> deleteEmployee(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}
	

}
