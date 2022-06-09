package com.org.Controller;
interface A1
{
	void show();
}

/*class D implements A1, A2
{

	//@Override
	public void show() {

System.out.println("Hi");
		
		
		
	}
	
	
	
}*/


public class TestInterfaceQ5 {

	public static void main(String[] args) {
A1 aobj=new A1() {
	
	@Override
	public void show() {

 System.out.println("Hi");
		
	}
};
aobj.show();
  

	}

}
