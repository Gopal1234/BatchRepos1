package com.org.Controller;
class Parent {
	protected static int count=0;
	public Parent () { 
		System.out.println("Hello");
		
		count++;
	System.out.println(count);	
	}
	static int getCount() 

{ return 

count; }
}

public class Child extends Parent {
public Child() { 
	String s1="hello";
	String s4=new String("hello");
	if(s1.equals(s4))
	{
		System.out.println("same");
	}
	else
	{
		System.out.println("not same");	}
	String s2="ji";
	if(s1.equals("ji"))
	{
		
	}
	
	System.out.println("hi");
	
	count++;
	System.out.println(count);	}
public static void main(String [] args) {
		System.out.println("Count = "+getCount());
		Child obj = new Child();
		System.out.println("Count = "+ getCount());
}
}