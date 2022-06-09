package com.org.Controller;


class AB
{
	
	int a=20;
	public void setA(int a )
	{
		this.a=a;
	}
	public AB()
	{
		
		this("Hello From Overloaded constructor");
	}
	public void display()
	{
		System.out.println("Hi");
	}
	public AB(String msg)
	{
	System.out.println(msg);	
	}
	
}
class CD extends AB
{
	public CD()
	{
		super();
		System.out.println("I am child class constructor");
	}
	public void display()
	{
		super.display();
		System.out.println("Hello");
	}
}
public class TestQ2 {
	public static void main(String[] args) {
		new CD().display();;
	}

}
