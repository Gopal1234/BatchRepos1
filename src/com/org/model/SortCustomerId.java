package com.org.model;

import java.util.Comparator;

public class SortCustomerId  implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
   if(o1.getCustomerId() >o2.getCustomerId())
   {
	   return 1;
   }
		return -1;
	}

}
