package com.org.Controller;

import java.util.Scanner;
class Employee
{
	int empId;
	String empName;
	double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
/*equals()
 * equlasIgnoreCase()
 * indexOf(char ch)
 * indexOf(String str)
 * lastIndexOfOf(char char)
 * lastIndexOf(String str)
 * charAt(int index)--char
 * split(String regex)---String[]
 * concat()
 * contains()
 * matches()
 * subString()
 * replace()
 * replaceAll()
 * toCharArray()
 * 
 * 
 * 
 */


public class TestStringDemo3 {
	// working feeback management system
			//I am getting feedback from customer as a string
			//I have to whether feedack length is more than 4 characters or not
			//I remarks section It should conatain atleast 4 sentences.
			
	
	public static boolean checkFeedback(String feedback)
	{
		if(feedback.length()>=4)
		{
			return true;
		}
		return false;
		
	}
	
	public static Employee getEmployeeInfo(String employeeInfo)
	{
		
		//102,Ravi,3456.89
		//0     1     2
		//["102"]["Ravi"]["443"]
		String[] empResult=employeeInfo.split(",");
		int empId=Integer.parseInt(empResult[0]);
		String empName=empResult[1];
		double salary=Double.parseDouble(empResult[2]);
		Employee e=new Employee(empId, empName, salary);
		return e;
		
	}
	
	
	
	//I remarks section It should conatain atleast 4 sentences
	public static boolean checkRemarks(String remarks)
	{
		//session was good. we laerned java.java i simple.
		
		//"[\\.\\s_]"
		// String[] split(String regex)
	//String[] result1=	remarks.split("[\\.\\s]");
		String[] result1=	remarks.split("[\\.]");
	
	for(String str: result1)
	{
		System.out.println(str);
	}
	
	
	
	if(result1!=null)
	{
		if(result1.length >=2)
		return true;
	}
		return false;
	}
	
	

	public static void main(String[] args) {

  
		String feebackMsg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your feeback");
		feebackMsg=scanner.nextLine();
		System.out.println("Enter your remarks");
		String remarks=scanner.nextLine();
		boolean chkFeedback=checkFeedback(feebackMsg);
		if(chkFeedback)
		{
			System.out.println("valid feedback");
			
		}
		else
		{
			System.out.println("Invalid feedback");
			
		}
		
		
		boolean rmrks=checkRemarks(remarks);
		if(rmrks)
		{
			System.out.println("valid remarks");
		}
		else
		{
			System.out.println("Invalid remarks");
		}
		
		System.out.println("Enter employee info separated by ,");
		String empInfo=scanner.nextLine();
	Employee e=	getEmployeeInfo(empInfo);
		
	System.out.println(e);	
		
		
		
		
		

	}

}
