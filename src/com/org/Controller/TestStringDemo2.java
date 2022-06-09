package com.org.Controller;

import java.util.Scanner;

public class TestStringDemo2 {

	public static void main(String[] args) {
//Data source
String[] users= {"admin","customer", "supplier"};
String[] passCode= {"andmin123","xyz345","password123"};
		//login 

Scanner scanner =new Scanner(System.in);
System.out.println("Enter the user name");
String userName=scanner.next();//Admin\n
scanner.nextLine();
System.out.println("Enter the password");
String pass=scanner.nextLine();//admin
System.out.println(userName + " "+pass);
int flag=0;
		//checking
for(int i=0; i<users.length; i++)
{
	
	if(users[i].equalsIgnoreCase(userName) && passCode[i].equals(pass))
	{
		//System.out.println("You are valid user");
		flag=1;
		break;
		
	}
	
	
}
		
		if(flag==1)
		{
			System.out.println("You are the valid user");
			//  "admin".indexcOf('a');
			// 'a','d','m','i','n
			// char charAt(2)
			  char ch=userName.charAt(2);
			 System.out.println(ch);
			 // int indexOf(char ch)
			 //int indexOf(String str)
		int index1=	 userName.indexOf(ch);
			System.out.println(index1);
			//I want to fetch the character from string which is there at last position
			
			//int length()
		char ch1=	userName.charAt(userName.length()-1);
		System.out.println(ch1);
		int index2=userName.indexOf(ch1);
		System.out.println(index2);
		//andmin123 n--1,5
			char ch3=pass.charAt(1);
			System.out.println(ch3);
		int index3=	pass.lastIndexOf(ch3);
			System.out.println(index3);
			
			int index4=pass.indexOf(pass.charAt(pass.length()-2));
			
			
			
			System.out.println(index4);
			
			
			//conevert any tyep conevert into string
			// String valueOf(int );
			String sIndex1=String.valueOf(index1);
			String sIndex2=String.valueOf(index2);
			String sIndex3=String.valueOf(index3);
			String sIndex4=String.valueOf(index4);
			//2457
			// String concat(Striing)
			//System.out.println(sIndex1+sIndex2+sIndex3+sIndex4);
			System.out.println(sIndex1.concat(sIndex2).concat(sIndex3).concat(sIndex4));
			
			
		}
		else
		{
			System.out.println("Invalid");
		}
		
		

	}

}
