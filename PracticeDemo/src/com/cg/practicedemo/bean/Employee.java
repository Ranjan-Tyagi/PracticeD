package com.cg.practicedemo.bean;

public class Employee {

	private int empId;
	private String empName;
	private int empSal;
	public int getEmpId() {
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(obj instanceof Employee)
		{
			Employee emp = (Employee)obj;
			if(emp.empId==this.empId&&emp.empName.equals(this.empName)&&emp.empSal==this.empSal)
			{
				flag = true;
			}
			else
				flag = false;
		}
		return flag;
	
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empName.length()+5;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}
	public Employee(int empId, String empName, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
}
