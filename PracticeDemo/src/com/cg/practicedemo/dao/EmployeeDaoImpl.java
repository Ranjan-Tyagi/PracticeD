package com.cg.practicedemo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.practicedemo.bean.Employee;
import com.cg.practicedemo.exception.EmployeeException;
import com.cg.practicedemo.staticdb.StaticDB;

public class EmployeeDaoImpl implements EmployeeDao{

	HashMap<Integer,Employee> map = StaticDB.getEmployees();
	List<Employee> list = new ArrayList<Employee>(map.values());
	
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		map.put(emp.getEmpId(), emp);
		return emp;
	}

	@Override
	public HashMap<Integer, Employee> showAllEmployees() throws EmployeeException{
		// TODO Auto-generated method stub
		if(map.size()==0)
			throw new EmployeeException("No employee data found");
		else
			return map; 
	}

	@Override
	public List<Employee> deleteEmployee(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		if(map.size()==0)
			throw new EmployeeException("No employee data found");
		if(map.containsKey(id)) {
			map.remove(id);
			List<Employee> list = new ArrayList<Employee>(map.values());
			return list;
			}
		else
			System.out.println("Employee not found");
			return null;
		
	}
}
