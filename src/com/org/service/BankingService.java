package com.org.service;
//component consisting only one method
@FunctionalInterface
public interface BankingService {

	//public and abstract
	
	public boolean adminLogin(String userName, int password);
	//public void show();
	public  default String displayMsg()
	{
		return "Good morning";
	}
	
	
	
	
}
