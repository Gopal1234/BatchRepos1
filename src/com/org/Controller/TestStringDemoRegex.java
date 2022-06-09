package com.org.Controller;

public class TestStringDemoRegex {

	
	public static boolean getString(String str)
	{
		//"[a-zA-z]{1,}[\\s'-]+[a-zA-z]"
		
		
	String regex="[A-Za-z]{1}[a-zA-z\\s'-]+[a-zA-z]{1}";
		//String regex="^([a-zA-Z0-9\\s'-]+\s?)*$";
		if(str.matches(regex))
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println((getString("Daniel D'Cruz")));  returning true
		//System.out.println((getString("Giselle Dawn-Wright"))); returning true
		System.out.println((getString("Giselle Dawn")));  //returning true 
		
	}

}
