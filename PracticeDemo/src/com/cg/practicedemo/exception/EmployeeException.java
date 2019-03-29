package com.cg.practicedemo.exception;

public class EmployeeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public EmployeeException(String message)
	{
		super();
		this.message = message;
	}

}
