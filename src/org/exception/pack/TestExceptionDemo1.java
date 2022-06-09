package org.exception.pack;
/*
 * Exception is an abnormal code behaviour
 *
 * 
 *    in java exception is an object
 *       java.lang.*--default
 *             |
 *             Throwable<class>
 *             |
 *             1.Exception<class>
 *             i.CheckedException or compile time exception
 *             
 *             a.FileNotFoundException
 *             
 *               File("D:/a.txt")
 *               
 *              b. SQLExcption
 *              
 *               c.ClassNotFound
 *               
 *               
 *             
 *               
 *             
 *             
 *             
 *             ii.unchecked exception or runtime exception
 *             a.ArrayIndexOutofBoundException
 *             b.
 *             
 *             
 *             
 *             2.Error<class>
 * 
 * 
 * 
 *  i.try
 *  {
 *  st1;null pointer
 *  st2;
 *  
 *  }catch(Exception e)
 *  {
 *  System.out.println("error msg"+e)
 *  
 *  }
 *  ii.catch
 *  iii.throw
 *  iv throws
 *  v.finaly
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */






import java.util.Scanner;

public class TestExceptionDemo1 {
	
	
	public static int calculateDivision(int number1, int number2)
	{
		int result=0;
		try
		{
			//10000 line code
			//develop
			
	 result=number1/number2;//new ArithmeticException()
		}
		catch (Exception e) {
			System.out.println("Give number2 > 0");
			main(null);
		}
		
		return result;
	}

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
   System.out.println("Enter number1");
   int num1=scanner.nextInt();
   System.out.println("Enter number2");
   int num2=scanner.nextInt();
   System.out.println(calculateDivision(num1, num2));
   
   
		
		
		
		

	}

}
