package com.org.Controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestStringDemo4 {
	public static void main(String[] args) {
		
  /* String str="Ravi Kumar";
   
	char[] ch=	str.toCharArray();
	
	byte[] b=  str.getBytes();
	System.out.println(Arrays.toString(b));
	for(char ch1:ch)	
	{
		System.out.println((int)ch1);
	}
		
	String msg="Hello World";
	String updatedMsg=msg.replace("Hello", "Bollo");
	//Tello World
	System.out.println(updatedMsg);
	
	String name="Ravi Kumar";
	String newName=name.replaceAll("[AEIOUaeiou]", "#");
		System.out.println(newName);*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter customer email id");
		String emailId=scanner.nextLine();
		System.out.println("Enter customer phone number");
		long phone=scanner.nextLong();
       /*
        * mail id: upadhyay076@gmail.com
        * phone:8147117572
        *  upadhyay7572
        * 
        * 
        * 		
        */
		// substring(int index)---String
		//substring(int beg, int  end)---String
		String email1=emailId.substring(0,7);
		//81471175772 10-4=6
		String ph=String.valueOf(phone);
		String phoneNum=ph.substring(ph.length()-4);
		//System.out.println(email1);
		//System.out.println(phoneNum);
		
		String password=email1.concat(phoneNum);
		System.out.println("your password is" + " "+password);
		
		
		
		
		
	}
	//user email id and user phone number I want to generate one unique password
	
	
	
	

}
