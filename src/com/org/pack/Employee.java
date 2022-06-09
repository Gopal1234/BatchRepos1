package com.org.pack;

public class Employee {

	//by default this variable having deafult value
	//non-static 
	public int empId=1;
	private double salary=4566.00;
	protected String empEmail="abc@gmail.com";
	//default 
	long phone=4767585;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, double salary, String empEmail, long phone) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.empEmail = empEmail;
		this.phone = phone;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	//either we can intialize this variable or properties with setter methods 
	//or parameterized constructor
	
	
}
