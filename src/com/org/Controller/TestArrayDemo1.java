package com.org.Controller;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * I have store marks of 10 students 
 * I have to calculate percentage
 * I have display all marks
 * 32 +5 37
 * If marks will less then 35 and < 30 then I have to add grace marks
 * I have to count number passed or number of failed student
 * {10,47,38,89,90,2,3,56}--integer elements
 * []
 * int a=35
 * 
 * Array container object which can store more than one elements with fixed size
 * 
 * 
 * 
 * 
 * 
 */
class  StudentBO
{
	
	public static int[] setGraceMarks(int[] number)
	{
		
		//int[] modifiedMarks=new int[number.length];
		for(int i=0; i<number.length; i++)
		{
			//number[1]=<35 &&number[1]>30
			if(number[i]<35 && number[i]>=30)
			{
				number[i]=number[i]+5;	
			}
		}
		
		return number;
	}
	
	
	//original-[10,30,56,78,89,90,67,78]--to tempraary[10,30,56,78]---data source to user so that user can access
	//Arrays--array object
	//System-array object
	//public static int[] copyMarksArray(int[] marks)
	public static int[] copyMarksArray(int[] marks, int from, int to)
	{
	//copyOf(Original array, new length)
		//sort()
		//toString()
		//asList()
		//copyOf(arrayobject, int)
		//copyOfRange(array, int from, int to
		
		
		int[] original=setGraceMarks(marks);
	int[] copiedResult=	Arrays.copyOfRange(original, from, to);
		
		
		
		return copiedResult;
	}
	
	
	/*This will be implemented by you
	public static int getTotalMarks(int[] marks)
	{
		
	}
	//sorting using Arrays class
	public static int[] sortMarks(int[] marks)
	{
		
	}
	//you will implement
	public static int[] calculatePer(int[] numbers)
	{
		
		
		
	}
	
	//you will implement 
	public static String sayPassOrFail(int[] marks)
	{
	
	
		
	}*/
	
	
	
	
}




public class TestArrayDemo1 {

	public static void main(String[] args) {
         //index value //
		//0   1  2  3  4  5  6  7 8  9
		//[0][0][0][0][0][0][0][0][0][0]
		//int[] marks1= {10,45,78,90,222,78};
   int[] marks=new int[10];
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter marks of 10 students");
   for(int i=0; i<marks.length; i++)
   {
	   //10,45,56
	   marks[i]=scanner.nextInt();
   }
   
   
   int size=marks.length;
   for(int i=0; i<size; i++)
   { 
	 int element=marks[i];  
	   System.out.println(element);
   }
   
   System.out.println("Printing after adding grace marks******");
      	int[] result=	StudentBO.setGraceMarks(marks);
	//Type obejc:DataSource
	for(Integer i:result)
	{
		System.out.println(i);
	}
   
int[] result2=	StudentBO.copyMarksArray(marks, 3, 7);
  System.out.println(Arrays.toString(result2));
   
   

	}

}
