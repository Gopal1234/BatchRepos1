package com.org.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class MyClass
{
	public static String searchByName(List<String> names, String searchName)
	{
		
		
		for(int i=0; i<names.size(); i++)
		{
			if(names.get(i).equals(searchName))
			{
				return searchName;
			}
		}
		return"abc";
	}
	
	public static List<String> removeByName(List<String> names, String removeName)
	{
		/*
		 * for(int i=0; i<names.size(); i++)
		 * {
		 * if(names.get(i).equals(removeName))
		 * {
		 * names.remove(i);
		 * }
		 * }
		 * 
		 */
		//names=="A,"b,c,d
		for(String name:names)
		{
			//"a"=="a"
			if(name.equals(removeName))
			{
				//remove(int index)---Object
				//remove(Object object)---boolean
		//boolean status=	names.remove(name);	
		//System.out.println(status);
			int index=	 names.indexOf(removeName);
			String str	=names.remove(index);
			System.out.println("removed string is" + " "+str);
			}
			
			
			
		}
		return names;
		
	}
	
	public static List<String> mergeTwoList(List<String> list1)
	{
		List<String> list2=new ArrayList();
		list2.add("A");
		list2.add("B");
		list2.add("T");
		list2.add("K");
		list2.add("sdsfs");
		
		//list1={A,B,Ravi,K}
		//list2={A,B, T,K}
		// boolean addAll(Collection collection)
		//list2.addAll(list1);
		
		//list2.retainAll(list1);
		list2.removeAll(list1);
		
		return list2;
		
		
		
		
		
	}
	public static Object[] convertToArray(List<String> names)
	{
		Object[] str=names.toArray();
		return str;
	}
	
	public static List<String> sortByName(List<String> names)
	{
		Collections.sort(names);
		return names;
	}
	
	public static List<String> updateList(List<String> names,int index, String newName)
	{
		
		/*StringBuffer sb=new StringBuffer("hi");
		sb.replace(0,1,"A");
		System.out.println(sb);*/
		names.set(index, newName);
		 
		return names;
		
	}
	
	
	
}
public class TestCollectionDemo3 {

	
	
	
	
	
	public static void main(String[] args) {

/*
 * add(Object obj)--boolean
 * get(int index)---Object
 * contains(Object object)--boolean
 * size()--int
 * iterator()---Iterator{hasNext(), next(), remove()}
 * remove()
 * toArray()---Object[]
 * indexOf()
 * lastIndexOf()
 * set(int index, Objec obj)
 * addAll(Collecton)
 * retainALl(collection )
 * removeAll(Collection)
 * 
 * 
 * 
 * 
 */
	List<String> listOfName1=new ArrayList();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the names into list");
	for(int i=0; i<5; i++)
	{
		String name=scanner.nextLine();
		listOfName1.add(name);
		
	}
	
	for(String s:listOfName1)
	{
		System.out.println(s);
	}
	
	
	System.out.println("searching by names......");
	//ClassName.methodName()
	String n1=	MyClass. searchByName(listOfName1, "Ravi");
	System.out.println(n1);	
		
	
	
	/*System.out.println("after removing the list.......");
	System.out.println("Enter name to remove");
	String name1=scanner.nextLine();
	List<String> resultList=MyClass.removeByName(listOfName1,name1 );
	System.out.println(resultList);	*/
		
	System.out.println("After merging two list...");
	List<String> finalList=MyClass.mergeTwoList(listOfName1);
	for(String s:finalList)
	{
		System.out.println(s);
	}
	System.out.println("converting list into static array...");
	Object[] resultArray=MyClass.convertToArray(listOfName1);
	for(Object s:resultArray)
	{
		System.out.println(s);
	}
	
	System.out.println("sort list...");
	List<String> finalList1=MyClass.sortByName(listOfName1);
	for(String s:finalList1)
	{
		System.out.println(s);
	}
	
	System.out.println("after update list...");
	List<String> finalList2=MyClass.updateList(listOfName1,3, "TTT");
	for(String s:finalList2)
	{
		System.out.println(s);
	}
	
	
	

	}

}
