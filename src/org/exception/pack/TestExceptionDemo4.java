package org.exception.pack;

import java.io.IOException;
import java.sql.SQLException;

//I want to create my own exception class or user defined exception class
//
class InvalidAmountError extends Exception
{
	public InvalidAmountError(String errorMsg)
	{
		super(errorMsg);
	}
}

class BankBO
{
	double availableAmount=65000.00;
	//if anyone will give invalid amount then this method can capable to handle exceptions
	//access_specifier  non-access-specifier return type name(param1, param2---n)throws 
	//default 
	public BankBO()throws IOException
	{
		
	}
	double withdraw(double amount)throws InvalidAmountError, IOException, SQLException
	{
		//File related java code
		//SQL code
		if(amount>availableAmount)
		{
			//explicitly I am throwing my  exception as per my condition
			//throw new Throwbale
		throw new InvalidAmountError("give amnount less then" + " "+availableAmount);	
		}
		return availableAmount-amount;
		
		
		
	}
	
	
	
	
	
	
	
}

public class TestExceptionDemo4 {

	public static void callMethods() //throws IOException, InvalidAmountError, SQLException 
	{
		
		 //either I can surrounded the entire statements within try-catch block
		 //we can add throws declaration with caller method(main method)
		
	//	BankBO bank=new BankBO();
		
		//bank.withdraw(78000.00);
		
	try
		{
			BankBO bank=new BankBO();
	System.out.println(	 bank.withdraw(70000.00));
		}catch (InvalidAmountError e) {
			// TODO: handle exception
		}
		catch(SQLException se)
		{
			
		}
		catch(IOException ie)
		{
			
		}

	}
	public static void main(String[] args) //throws IOException, InvalidAmountError, SQLException  
	{

 callMethods();
	}

}
