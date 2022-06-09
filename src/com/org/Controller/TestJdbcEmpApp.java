package com.org.Controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Scanner;

import com.org.model.Employee;
import com.org.service.EmployeeService;
import com.org.serviceimpl.EmployeeDao;

public class TestJdbcEmpApp {
public static void main(String[] args) throws SQLException, IOException {
	 EmployeeService service=new EmployeeDao();
	Reader reader=new FileReader("D:/abc.txt");
	
	BufferedReader br=new BufferedReader(reader);
	String str= br.readLine();
	 
	 while((str=br.readLine())!=null)
	 {
		// System.out.println(str);
		  String[] inputs= str.split(",");
		int id=Integer.parseInt(inputs[0].trim());
		String empName=inputs[1];
		String empAddress=inputs[2];
		String email=inputs[3];
		long phone=Long.parseLong(inputs[4]);
		float salary=Float.parseFloat(inputs[5]);
		// System.out.println(id + " "+empName+ " "+empAddress + " "+email + " "+phone+ " "+salary);
		 Employee e=new Employee(id, empName,salary, email, phone, empAddress);
			int k= service.addEmployee(e);
			 if(k>=1)
			 {
				 System.out.println("Data inserted");
				 //  service.viewAllEmployee().forEach(emp->System.out.println(emp.getId()+ " "+emp.getName() +" "+emp.getEmail()+ " "+emp.getSal()));
				 
				 
				 
				 
			 }
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	/* Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter employee id");
	 int id=Integer.parseInt(scanner.nextLine());
	 
	 System.out.println("Enter employee name");
	String empName=scanner.nextLine();
	 System.out.println("Enter employee address");
	String empAddress=scanner.nextLine();
	 System.out.println("Enter employee mail");
	String emial=scanner.nextLine();
	System.out.println("Enter employee phone");
	 long empPhone=Long.parseLong(scanner.nextLine());
	 System.out.println("Enter employee salary");
	 float salary=Float.parseFloat(scanner.nextLine());*/
	/* Employee e=new Employee(id, empName,salary, emial, empPhone, empAddress);
	int k= service.addEmployee(e);
	 if(k>=1)
	 {
		 System.out.println("Data inserted");
		   service.viewAllEmployee().forEach(emp->System.out.println(emp.getId()+ " "+emp.getName() +" "+emp.getEmail()+ " "+emp.getSal()));
		 
		 
		 
		 
	 }
	Employee e1=  service.getEmployeeById(11);
	 System.out.println(e1.getId() + " "+e1.getName() + " "+e1.getAddres());*/
	 
}
}
