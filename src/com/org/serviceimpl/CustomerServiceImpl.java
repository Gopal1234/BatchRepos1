package com.org.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.org.model.Customer;
import com.org.model.SortCustomerId;
import com.org.service.CustomerService;

public class CustomerServiceImpl implements CustomerService
{

	List<Customer> listOfCustomer=new ArrayList<Customer>();
	@Override
	//add customer object into one list
	public boolean addCustomer(Customer customer) {
            
  if(listOfCustomer.add(customer))
  {
	  return true;
  }
		return false;
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return listOfCustomer;
	}

	@Override
	public Customer removeCustomerById(int customerId) {
  LinkedList<Customer> finalList=new LinkedList<Customer>(listOfCustomer);
		//we have to iterate collection from first object to last obejct
		//we have fetch each and every object and check whether that object(Customer) having the same customerId or not
         for(int i=0; i<finalList.size(); i++)
         {
        	 //Customer object
        	 Customer customer=finalList.get(i);
        	 if(customer.getCustomerId()==customerId)
        	 {
        		 //remove(int i)---Object
        		 //remove(Object object)--boolean
        		 return  finalList.remove(i);
        	 }
         }
		
		
		
		
		
		return null;
	}

	@Override
	public List<Customer> updateCustomerPhone(int customer, long phone) {
	//phone, email , address
		for(int i=0; i<listOfCustomer.size(); i++)
		{
			if(customer==listOfCustomer.get(i).getCustomerId())
			{
				Customer c=listOfCustomer.get(i);
				c.setCustomerPhone(phone);
				
			}
		}
		
		
		
		return listOfCustomer;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortByDateOfBirth() {

		/*
		 * Integer implements Comparable --compareTo(Object obj)--int
		 * String implements Comparable
		 * Float implements Comparable
		 * Double implements Comparable
		 * 
		 */
		
		//List<Integer> listOfInt=new ArrayList();
  //Collections.sort(listOfInt);
		//Arrays.sort(arrayObject)
		//sort(List type)--which will be implemented by Comparable
		//sort(list,new Comparator());
		Collections.sort(listOfCustomer);
		
		
		return listOfCustomer;
	}
	
	public List<Customer> sortById()
	{
		Comparator<Customer> cmp=new SortCustomerId();
		//sort(list<customer>,object of comaparator
		//Collections.sort(listOfCustomer,new SortCustomerId());
		Collections.sort(listOfCustomer,cmp);
		return listOfCustomer;
	}
//implement by comparator
	//create a separate componennts
	@Override
	public List<Customer> sortByPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}
//if customerId will present then throw IdNotAvailableException
	
	@Override
	public List<Customer> updateCustomerInfo(int customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	
}