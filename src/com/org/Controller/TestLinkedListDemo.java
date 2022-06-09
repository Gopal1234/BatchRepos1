package com.org.Controller;


import java.util.*;


/*
 * ArrayList : ArrayList is one of the implementation class of List interface.
 * ArrayList uses growable array
 * 0 1 2 3 4 5 6
 * [][][][][]
 * 
 * I want add 100000 object of customer in collection --ArrayList
 * I want to remove 1000000 objects of customer---


     LinkedList: LinkedList is one of the implementation class of List interface
 *  Doubly linked list
 *  null<--[prev][Data][next]--->[prev][data][next]--->null--->null
 *  
 * 
 * 
 * 
 */
public class TestLinkedListDemo {

	public static void main(String[] args) {
  // ArrayList()---It will array list object with default capacity 10
		
		//LinkedList() --create a empty list
		//LinkedList(Colllection collection)
	/*LinkedList list2=new LinkedList();
	list2.add(1);
	list2.add(3);*/
	//ArrayList(Collection collection)--Stack, Vector, Set,Queue
	//ArrayList(int capacity) 100
	//ArrayList al=new ArrayList(list2);
//System.out.println(al);
   List<Integer> list1=new ArrayList();
		
		list1.add(100);
		list1.add(1);
		list1.add(50);
		
		
		//getFirst Object from list1
		//getLast object from list1
		//removeFirst
		//removeLast
		
	LinkedList list2=new LinkedList(list1);	
	//List list2=new LinkedList();
	//list2.
	//class LinkedList
	
	/*
	 * add(Object)
	 * remove(int index)
	 * get(int index)
	 * removeAll()
	 * r
	 * 
	 * 
	 * 
	 */
		
		list2.addFirst(5);
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		
	//Iterator itr=	list2.descendingIterator();
		Iterator itr=	list2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(list2.removeFirst());
		
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
