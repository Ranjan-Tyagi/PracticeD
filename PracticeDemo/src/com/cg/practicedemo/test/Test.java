/**
 * 
 */
package com.cg.practicedemo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.practicedemo.bean.Employee;
import com.cg.practicedemo.dao.EmployeeDao;
import com.cg.practicedemo.dao.EmployeeDaoImpl;
import com.cg.practicedemo.exception.EmployeeException;
import com.cg.practicedemo.staticdb.StaticDB;

/**
 * @author agupt166
 *
 */
public class Test {

	/**
	 * Test method for {@link com.cg.practicedemo.dao.EmployeeDaoImpl#addEmployee(com.cg.practicedemo.bean.Employee)}.
	 */
	HashMap<Integer,Employee> map = StaticDB.getEmployees();
	EmployeeDao dao = new EmployeeDaoImpl();
	
	@org.junit.Test
	public void testAddEmployee() {
		Employee emp=new Employee(105,"arati",50000);
		assertEquals(emp,dao.addEmployee(emp));
	}

	/**
	 * Test method for {@link com.cg.practicedemo.dao.EmployeeDaoImpl#showAllEmployees()}.
	 * @throws EmployeeException 
	 */
	@org.junit.Test
	public void testShowAllEmployees() throws EmployeeException {
		assertEquals(map, dao.showAllEmployees());
	}

	/**
	 * Test method for {@link com.cg.practicedemo.dao.EmployeeDaoImpl#deleteEmployee(int)}.
	 * @throws EmployeeException 
	 */
	@org.junit.Test
	public void testDeleteEmployee() throws EmployeeException {
		//System.out.println(list);
		List<Employee> ulist = dao.deleteEmployee(102);
		List<Employee> list = new ArrayList<>(map.values());
		assertEquals(list,ulist);
	}

}
