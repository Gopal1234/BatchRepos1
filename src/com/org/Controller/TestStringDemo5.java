package com.org.Controller;

class Employee123
{
	//upadhyay076@gmail.com
	//abc#123 @@ capogemini..com
	
	
	public static boolean verifyEmailFormat(String email)
	{
		//int a=b+c;
		//b>c
		// abc_123-a@gmail.com
		//[A-za-z_0-9#]+[@]{1}[a-zA-z]+[.]{1}[a-zA-z]{3}
		String regexForEmail="[A-Za-z0-9_]+[@]{1}[a-zA-z]+[.]{1}[a-zA-z]{3}";
		if(email.matches(regexForEmail))
		{
			return true;
		}
		
		return false;
	}
	//first five character is alphabts and upper case
	//next four character is didgit
	//last character in pan card should be alphabet and upper case
	//ABCDE1234Q
	//[A-Z]{5}[0-9]{4}[A-Z]{1}
	public static boolean verifyPan(String pan)
	{
		String regexForPanCard="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		if(pan.matches(regexForPanCard))
		{
			return true;
		}
		return false;
	}
	//7 8 9 6
	/*public static String verifyMobile(String phone)
	{
		
		
	}*/
	//first character should be apphabet and uppercase
	//next two characters shoulbe be digit
	//password must conatin atleast one special character
	//password should have min length shoule be 5
	//the last character in password should be only one alphabet
	/*public static String verifyPassword(String password)
	
	{
		
	}*/
}





public class TestStringDemo5 {

	public static void main(String[] args) {
		
boolean b=Employee123.verifyEmailFormat("upadhyay076gmail.com");
	if(b)
	{
		System.out.println("valid email id");
	}
	else
	{
		System.out.println("invalid email id");
	}

	boolean b1=Employee123.verifyPan("ADK4567Q");
	if(b1)
	{
		System.out.println("pan is valid");
	}
	else
	{
		System.out.println("not valid");
	}
	
	}

}
