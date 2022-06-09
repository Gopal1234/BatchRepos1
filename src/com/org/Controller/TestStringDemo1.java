package com.org.Controller;

/*
 * 
 * String name;
 * String email;
 * String address
 * String 
 * String str="Hello world" or char[] ch={'HI',
 * 
 * 
 * 
 * 
 * 
 * immutable means we can not change 
 * mutable we can change
 */

public class TestStringDemo1 {

	public static void main(String[] args) {
		
		
		/*
		 * stack          Heap [String pool]
		 * [name1]------>[ [102]104   ["Ravi]]
		 * [name2]------>[[102]
		 * 10000
		 */
	//string literal declaration	
   String name1="Ravi";
   String name2="Ravi";
   //string obejct creation using new keyword
   String name3=new String("Ravi");
   
   if(name1==name3)
   {
	   System.out.println("both address are same");
	   
   }else
   {
	   System.out.println("not same");
   }
   //boolean equals(String parameter)
 if(name1.equals(name3))
 {
	 System.out.println("Both values are same");
 }
 else
 {
	 System.out.println("values not same");
 }

	}

}
