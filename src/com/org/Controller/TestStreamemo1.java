package com.org.Controller;

//import java.util.ArrayList;
import java.util.*;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
import java.util.stream.*;

public class TestStreamemo1 {
	/*
	 * interface Predicate
	 * {
	 * boolean abc(T a)
	 * }
	 * filter()
	 * 
	 * 
	 * 
	 */
	
	// if the marks in stream will >=35 the passed
	// passed marks should be listed in different  list
	public static  List<Integer> getPassedScore(Stream<Integer> streamOfMarks)
	{
		/*ArrayList list=new ArrayList();
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)>=35)
			{
				list.add(list.get(i))
			}
		}*/
		//Non-terminal method
		//45,1
		//steam()--to create a stream on any data source
		//filter(boolean as predicate)
		//collect(Collectors.toList());
	//List<Integer> listOfPassedScore	=streamOfMarks.filter(m->m>=35).collect(Collectors.toList());
		
	return streamOfMarks.filter(m->m>=35).collect(Collectors.toList());
		//return listOfPassedScore;
	}
	
	public static int countPassesStudent(Stream<Integer> streamOfMarks)
	{  
		int  result=(int) streamOfMarks.filter(marks->marks>=35).count();
		return result;
	}
	
	//This method fetch the integer object and if object >=30 but less than <35 , then I will 5 more marks to that integer object
	//return as List
	public static List<Integer> getGraceMarks(List<Integer> listOfMarks)
	{
		
		listOfMarks.stream().filter(marks->marks>=30 && marks<35).forEach(marks->System.out.println(marks));
		System.out.println("***********");
	return	listOfMarks.stream().filter(marks->marks>=30 && marks<35).map(marks->marks+5).collect(Collectors.toList());
		
	}
	public static List<Integer> getSortedOrder(List<Integer> marks)
	{
	
List<Integer> list=	marks.stream().sorted().distinct().collect(Collectors.toList());
//Set<Integer> set1=new TreeSet<Integer>(list);
return list;
	
	}
	//map()reduce()
	/*public static int getTotal(List<Integer> list)
	{
		
	}*/
	//max()
	public static int getMaxMarks(List<Integer> list)
	{
		/*interface Comparator
		 * {
		 * int compare(int m, int n)
		 * {
		 * if(m>n)
		 * {
		 * return 1;
		 * }
		 * return -1;
		 * }
		 * 
		 */
	
		return  list.stream().max((m,n)->(m>n)? 1:-1).get();
	}
	//min()
	/*public static int getMinMarks(List<Integer> list)
	{
		
	}*/
	
 
	public static void main(String[] args) {
//Repository 
		//This is consisting original data
		//I do not want to modify this orginal source
		//I want to process as per my expectation
List<Integer> listOfMarks=new ArrayList();
listOfMarks.add(45);
listOfMarks.add(4);
listOfMarks.add(32);
listOfMarks.add(40);
listOfMarks.add(31);
listOfMarks.add(18);
listOfMarks.add(55);

  //I want to create one stream object on same list, set, array
Stream<Integer> streamOfMarks=listOfMarks.stream();
getPassedScore(streamOfMarks).forEach(n->System.out.println(n));
System.out.println("---------");
//streamOfMarks.forEach(n-> System.out.println(n));
		
	List<Integer> list=	getGraceMarks(listOfMarks);
	
		list.forEach(marks->System.out.println(marks));
	System.out.println("after sorting...");
	getSortedOrder(listOfMarks).forEach(n->System.out.println(n));
	
	System.out.println(getMaxMarks(listOfMarks));

	}

}
