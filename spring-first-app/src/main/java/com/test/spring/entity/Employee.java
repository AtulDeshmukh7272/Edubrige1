package com.test.spring.entity;

public class Employee {
	
	private int empid;
	private String empName;
	
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	
	

}
