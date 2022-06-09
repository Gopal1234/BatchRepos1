package com.org.Controller;

import java.util.Scanner;

import com.org.model.Employee;
import com.org.service.EmployeeService;
import com.org.serviceimpl.EmployeeBO;

public class Main {

	public static void main(String[] args) {
		/*
		 * class Scanner
		 * {
		 * Scanner(File file)
		 * Scanner(InputStream input)--read from file and console
		 * 
		 * 
		 * }
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your designation");
	String desg=	sc.next();
		
		System.out.println(name + " "+desg);
		
		//invoking constructor
		////
		Employee emp=new Employee(21312, "a", 223, "asdds", 4565, "aada", "sdsds");
		
		//emp.setId(12);
		//address is optional
		//emp.setAddres("asasa");
		emp.setEmail("asa");
		emp.setPhone(2322);
		emp.setSal(34334);
		System.out.println(emp.getId());
		EmployeeService service=new EmployeeBO();
		service.addEmployee(emp);
Employee e=service.displayEmployee();


System.out.println(e.getId() + ""+e.getDesg());
		
		
		
		
	}
}
