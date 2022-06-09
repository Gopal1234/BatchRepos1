package com.org.pack;
//
public interface SalaryCalculator  {
	
	
	public double calculateSalary(double basicPay, double pf, double hra, double ta,double ma, double tds);
	
	//public void show();
	default void display()
	{
	System.out.println("Good morning");	
	}
	

}
