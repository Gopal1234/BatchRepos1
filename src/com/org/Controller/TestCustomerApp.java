package com.org.Controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.org.model.Customer;
import com.org.service.CustomerService;
import com.org.serviceimpl.CustomerServiceImpl;

public class TestCustomerApp {

	public static void main(String[] args) {

  CustomerService service=new CustomerServiceImpl();
	Scanner scanner=new Scanner(System.in);	
  System.out.println("Enter the size of data base");
  int size=Integer.parseInt(scanner.nextLine());//3
  for(int i=0; i<size; i++)
  {
	  
	  System.out.println("Enter customer id");
	  int id=Integer.parseInt(scanner.nextLine());
	  
	  System.out.println("Enter customer name");
	  String custName=scanner.nextLine();
	  
	  System.out.println("Enter customer phone");
	  long ph=Long.parseLong(scanner.nextLine());
	  System.out.println("Enter customer address");
	  String address=scanner.nextLine();
	  System.out.println("Enter customer email");
	  String email=scanner.nextLine();
	  //-MM-yyyy
	  System.out.println("Enter customer dob in dd/MM/yyyy format");
	  String dob=scanner.nextLine();
	  System.out.println("Enter customer gender");
	  String gen=scanner.nextLine();
	  Customer customer=new Customer();// firstObj{1,A--- 
	  customer.setCustomerId(id);
	  customer.setCustomerName(custName);
	  customer.setCustomerPhone(ph);
	  customer.setEmailId(email);
	  customer.setAddress(address);
	  DateTimeFormatter foramt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate date1=LocalDate.parse(dob,foramt);
	  
	  
	  customer.setDob(date1);
	  customer.setGender(gen);
	  
	 if(  service.addCustomer(customer))
	 {
		 System.out.println("Customer object inserted into list");
	 }
  }
  
  System.out.println("Updating phone");
  System.out.println("Enter customer id to update");
  int updateId=Integer.parseInt(scanner.nextLine());
  System.out.println("Enter customer new phone");
  long updatePh=Long.parseLong(scanner.nextLine());
 List<Customer> listOfUpdatedPh=    service.updateCustomerPhone(updateId, updatePh);
  for(Customer c:listOfUpdatedPh)
  {
	  System.out.println(c);
  }
  
  
  
	  System.out.println("Enter customer id to remove");
	  int custId=Integer.parseInt(scanner.nextLine());
	  Customer c=   service.removeCustomerById(custId);
	  
	  if(c!=null)
	  
	  {
	  System.out.println(c.getCustomerId() + " "+c.getCustomerName() + " "+c.getCustomerPhone()+ " "+c.getCustomerPhone());
	  
	  System.out.println(c);
	  }else
	  {
		  System.out.println("customer id is not mathcing");
	  }
	  
	  
	  System.out.println("after sorting....");
	List<Customer> listOfCustomer=  service.sortByDateOfBirth();
	  for(Customer customer: listOfCustomer)
	  {
		  System.out.println(customer.getCustomerId() + " "+customer.getCustomerName() + " "+customer.getDob());
	  }
	  
	  
	  System.out.println("after sorting based on id....");
	List<Customer> listOfCustomer1=  service.sortById();
	  for(Customer customer: listOfCustomer1)
	  {
		  System.out.println(customer.getCustomerId() + " "+customer.getCustomerName() + " "+customer.getDob());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
		
		

	

}
