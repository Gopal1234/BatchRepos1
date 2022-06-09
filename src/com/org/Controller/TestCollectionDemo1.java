package com.org.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestCollectionDemo1 {

	public static void main(String[] args) {
/* Collection<interface>
 * |
 * List<ineterface> inherited Collection interface
 *  |
 *  ArrayList<class>
 *  LinkedList<class>
 *  Stack<class>
 *  Vector<class>
 * 
 */

	 List list=new ArrayList();
	// ArrayList list=new ArrayList();
	 
	 // add , remove, serach, update sort, fetch
	 list.add(100);//100
	 list.add(true);//true
	 list.add("abc");//ab
	 list.add(56.8f);
	 // size() return size of the list
	 int size=list.size();
	 System.out.println(size);
	 //I want to check whether list  containing "abc" object or not
	 // boolean conatins(Object obj)--
	boolean status=  list.contains("abc");
			System.out.println(status);
			if(status) {
				
				//to fetch the collection we can use for loop
				//for each loop
				//for each method
				//Iterator interface
				/*for(int i=0; i<list.size(); i++)
				{
					//get(int index)--Object
					System.out.println(list.get(i));
				}*/
				//obj=new Integer()
				//obj=new String()
				//obj=new Employee()
				/*for(Object obj :list)
				{
				System.out.println(obj);	
				}*/
				
				/*
				 * ineterface Iterator
				 * {
				 * boolean hasNext()
				 * Object next()
				 * void remove()
				 *  
				 *  }
				 * 
				 * class DummyClass implements Iterator
				 * {
				 * 
				 * 
				 * 
				 * 
				 */
				List list1=new ArrayList();
				
				Iterator itr=list1.iterator();
				
				/*
				 * itr--->{100, true, abc, 56.8}
				 *if 
				 * 
				 */
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				
				
				
				
				
			}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 //linkedlist data structure
	 /*listOfNames=new LinkedList();
	 //Doubly Linked List
	 listOfNames=new Stack();
	 //LIFO --push and pop
	 //
	 listOfNames=new Vector();
	 //*/
		
		
		
		
		

	}

}
