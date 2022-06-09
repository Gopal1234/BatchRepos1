package com.org.pack;

public class BankApp {
public static void main(String[] args) {
	//I have declared reference of abstract class 
	//super class for Sbi and Pnb
	RbiBank rbi;
	//upcasting
	//super_type_ref=object of sub_type
	rbi=new Sbi("Welcome to SBI");
	boolean status1= rbi.getBanking(rbi);
	if(status1)
	{
		System.out.println("sbi is valid bank");
	}
	else
	{
		System.out.println("not");
	}
	rbi.displayDate();
	System.out.println(rbi.doLogin(123));
	System.out.println(rbi.withdraw(5000.00));
	
	rbi=new Pnb("Welcome to PNB");
	boolean status2= rbi.getBanking(rbi);
	if(status2)
	{
		System.out.println("pnb is valid bank");
	}
	else
	{
		System.out.println("not");
	}
	rbi.displayDate();
	System.out.println(rbi.doLogin(878));
	double amt1=rbi.withdraw(1000.00);
	System.out.println(amt1);
	
	rbi=new Hdfc("Welcome to HDFC");
	boolean status3= rbi.getBanking(rbi);
	if(status3)
	{
		System.out.println("hdfc is valid bank");
	}
	else
	{
		System.out.println("not");
	}
	rbi.displayDate();
	System.out.println(rbi.doLogin(888));
System.out.println(	rbi.withdraw(1000.00));
	
	
	//hdfc
	
	
	
	
	
	
}
}
