package com.org.serviceimpl;

import com.org.service.BankingService;

//what are the 


class BankLoginService 
 
{
	
	public static BankingService getInstance()
	{
		BankingService service=	(userName,password)->{
			
			if(userName.equalsIgnoreCase("admin") && password==567)
			{
				return true;
			}
			return false;
		};
		return service;
	}
	
}
public class BankLoginServiceImpl     {

	public static void main(String[] args) {
	/*	BankingService service=new BankingService() {
			
			@Override
			public boolean adminLogin(String userName, int password) {
				if(userName.equalsIgnoreCase("admin") && password==567)
				{
					return true;
				}
				return false;
			}
		};
	if(	service.adminLogin("admin", 567))
	{
		System.out.println("valid user");
	}
	else
	{
		System.out.println("Invalid user");
	}
*/
		//lambda expression
		//(input)-> { //body we can write our business logic code }
		//I do not want to use implements keyword with class
		//public boolean adminLogin(
		// (input)-> { processing and  returning };
		//stream api---filter(
	BankingService service= BankLoginService.getInstance();

	System.out.println(service.displayMsg());
	if(	service.adminLogin("admin", 567))
	{
		System.out.println("valid user");
	}
	else
	{
		System.out.println("Invalid user");
	}
	}
		//BankingService service=	()-> { return "Good Afternoon"; };
	}

	
	

