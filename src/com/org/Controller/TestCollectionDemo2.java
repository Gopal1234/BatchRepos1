package com.org.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCollectionDemo2 {
	/*
	 * primitive type     non primitive
	 * int---               Integer i=new Integer(10)  
	 * float                 Float
	 * byte                   Byte
	 * short                  Short
	 * long                   Long
	 * double                  Double
	 * 
	 * int i=new int()
	 * int[] a=new int[]
	 * String s=new String()
	 * 
	 * only object
	 * 
	 * 
	 */
	
	
 static List<Integer> listOfMarks=new ArrayList();
	public static void addMarks(int marks)
	{
		
		 listOfMarks.add(marks);
		
	}
	public static  List<Integer> getMarks()
	{
		 return listOfMarks;
	}
	//10,30,50,60,3,7
	public static List<Integer> listOutEvenNumber(List<Integer> listOfNumber)
	{
		
	}
	
	public static List<Integer> addGraceMarks(List<Integer> marks)
	{
		
	}
	
	public static int countOddNumbers(Lis<Integer> marks)
	{
		
	}
	
	
	
	public static void main(String[] args) {


		
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<=4; i++)
		{
		//System.out.println("Enter marks for subject");
		int marks=Integer.parseInt(scanner.nextLine());
		addMarks(marks);
		}
		List<Integer> viewMarks=  getMarks();
		for(Integer i:viewMarks)
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
