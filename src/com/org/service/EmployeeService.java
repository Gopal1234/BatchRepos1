package com.org.service;

import java.sql.SQLException;
import java.util.List;

import com.org.model.Employee;

public interface EmployeeService {

	//we have add one employee  with value
	//This  method will add  employee details to the DB server
	int addEmployee(Employee emp)throws SQLException;
	//display employee objects with all paramters and value
	//This method will fetch all details from db server and store into list and return that list
	
	List<Employee> viewAllEmployee();
	
	//This method will fetch a particular employee object from DB based on employee id
	Employee getEmployeeById(int empId);
	
	Employee removeEmployeeById(int empId);
	
int   updateEmployeeById(int empId);
	
	
	
	
	
	
	
}
