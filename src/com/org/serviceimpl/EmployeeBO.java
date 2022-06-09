package com.org.serviceimpl;

import com.org.model.Employee;
import com.org.service.EmployeeService;

public class EmployeeBO  implements EmployeeService{

	Employee emp;
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.emp=emp;
	}

	@Override
	public Employee displayEmployee() {
		// TODO Auto-generated method stub
		return emp;
	}

}
