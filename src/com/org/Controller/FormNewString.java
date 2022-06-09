package com.org.Controller;

import java.util.Scanner;

public class FormNewString {

	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=sc.nextInt();
System.out.println(UserMainCode.stringChange(s,n));

	

}
}

 class UserMainCode {
	public static String stringChange(String s,int n)
	{
		
	
		StringBuffer sb=new StringBuffer();
	    sb.append(s.substring(0,n));
	    sb.append(s.substring(s.length()-n));
	    return sb.toString();
	}
}
