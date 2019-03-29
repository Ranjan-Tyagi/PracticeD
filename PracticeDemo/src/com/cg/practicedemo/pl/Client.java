package com.cg.practicedemo.pl;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.cg.practicedemo.bean.Employee;
import com.cg.practicedemo.exception.EmployeeException;
import com.cg.practicedemo.service.EmployeeService;
import com.cg.practicedemo.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service = new EmployeeServiceImpl();
		int choice = 0;
		try(Scanner sc = new Scanner(System.in))
		{
			do
			{
				System.out.println("1-Add Employee");
				System.out.println("2-Show All Employee");
				System.out.println("3-delete");
				System.out.println("4-Exit");
				System.out.println("Enter your choice::");
				choice = sc.nextInt();
				switch(choice){
				case 1: while(true)
						{
							System.out.println("Enter empId::");
							int id = sc.nextInt();
							if(service.validateEmpNo(id)){
								
								while(true)
								{
										System.out.println("Enter employee name::");
										String name = sc.next();
										if(service.validateEmpName(name))
										{
											while(true)
											{
												System.out
														.println("Enter salary");
												int sal = sc.nextInt();
												if(service.validateEmpSal(sal))
												{
													Employee emp = new Employee(id,name,sal);
													Employee obj = service.addEmployee(emp);
													System.out
															.println("Employee with empId = "+obj.getEmpId()+"is added successfully");
													break;
													
												}
											}
											break;
										}
									}
								break;
							}
						}
						break;
				case 2: try{
					
					HashMap<Integer,Employee>map = 
							service.showAllEmployees();
					if(map.size()!=0)
					{
						Set<Integer>keys = map.keySet();
						for(Integer key:keys)
						{
							System.out.println(map.get(key));
						}
					}
				}
				catch(EmployeeException e)
				{
					System.out.println(e.getMessage());
				}
				break;
				case 3: 
					System.out.println("Enter id to delete");
					int id = sc.nextInt();
					try{
					
					List<Employee> list = 
							service.deleteEmployee(id);
					
					if(list.size()!=0)
					{
						System.out.println("Deleted successfully:" + id);
						for(Employee value:list)
						{
							System.out.println(value);
						}
					}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
				case 4 : System.exit(0);
				}
				System.out.println("do you want to continue 1-yes 0-no");
				choice = sc.nextInt();
			}while(choice!=0);
			
		}
	}

}
