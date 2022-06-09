package com.org.pack;
/*
 * one component should consist all the pincode values of customer
 * another component should consist a method which return true if the given pin id will match with datasource or array
 * finaly these components should be implemented by one abstract class called RbiBank
 * 
 * 1.interface is collection of global constants and abstract methods
 * 2.by default public static and final
 * 3.by default are public and abstract
 * 
 * 
 * 
 */
//in different server 
interface DataSource1
{
	//all pin codes
	//
	//0-123, 1-567, 2-890, 3-7878
	//length is 4
	 int[] pinCode= {123,567,890,7878};
}
//in different server
interface LoginService
{
	//datasource--database server, cloud server, 
	//provind login service
	//jdk 1.8 introduced one default
	//void show();
default	boolean doLogin(int pin)
	{
		for(int i=0; i<DataSource1.pinCode.length; i++)
		{
			if(DataSource1.pinCode[i]==pin)
			{
				return true;
			}
		}
		return false;
	}
}
//different server
interface A
{
	
	void displayDate();
}

//we can not able instantiate abstract class
/*
 * multiple inheritance
 * A   B
 *  
 *    C
 *    
 * 
 * 1.pure abstraction
 * 2. we can use interface as replacment of multiple inheritance
 * 
 * 
 */
//interface can be implemented by classes
public abstract class RbiBank  implements DataSource1,LoginService,A{
	//public displayDate();
	private double amount=20000.00;
//constructor do not have return type	
	
	
	
public RbiBank(String msg)
{
	System.out.println(msg);
}
public RbiBank() {
	
	super();
	// TODO Auto-generated constructor stub
}
//method must have return type
//primitive types,string,arrays,class type,interface tyep, list , set, map, object[], T,void
//if you are the customer then you can use by giveing user id and password
public double withdraw(double amount)
{
	this.amount=this.amount-amount;
	return this.amount;
}
	//sbi, icici, hdfc, pnb
//This method should be decalre and shoule overidden by all the sub class rbi
//method should be abstract or unimplemented
//
 abstract boolean getBanking(RbiBank rbi);
 
	
	
	

}
