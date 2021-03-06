package com.org.service;

import java.util.List;

import com.org.model.Customer;

public interface CustomerService {
	
	//1we will store many customer objects into list
	boolean addCustomer(Customer customer);
	
	// 2 This will return all customer object as list
	List<Customer> getCustomer();
	
	//3which remove one customer obejct from list and return that customer object
	Customer removeCustomerById(int customerId);
	
	//4
	List<Customer> updateCustomerPhone(int customer , long phone);
	
	//5 search customer by id
	Customer searchCustomerById(int customerId);
	
	//6
	List<Customer> sortByDateOfBirth();
	
	
	List<Customer> sortById();
	
	List<Customer> sortByPhoneNumber();
	
	List<Customer> updateCustomerInfo(int customerId, Customer customer);
	
	
	
	

}
