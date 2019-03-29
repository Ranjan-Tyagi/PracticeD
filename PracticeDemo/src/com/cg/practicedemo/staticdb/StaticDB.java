package com.cg.practicedemo.staticdb;

import java.util.HashMap;

import com.cg.practicedemo.bean.Employee;

public class StaticDB {
	
	static HashMap<Integer,Employee>map =
			 new HashMap<Integer,Employee>();
	
	static
	{
		map.put(101,new Employee(101,"Bharati",30000));
		map.put(102,new Employee(102,"Rima",40000));
		map.put(103,new Employee(103,"Kavita",20000));
		map.put(104,new Employee(104,"Pooja",40000));
	}
	
	public static HashMap<Integer,Employee> getEmployees()
	{
		return map;
	}
}
