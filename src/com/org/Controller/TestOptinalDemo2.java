package com.org.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class MyClass1
{
	
	public static Optional<Integer> getOptionalForList(List<Integer> list)
	{
		
		Optional<Integer> op=null;
		for(int i=0; i<list.size(); i++)
		{
		op=Optional.ofNullable(list.get(i));
		System.out.println(op.isPresent());
		
	 int k=   op.orElse(1000);
	    System.out.println(k);
		}
	    return op;
		
		
		
	}
	
	
	
}


public class TestOptinalDemo2 {

	public static void main(String[] args) {

Optional<Integer> op=MyClass1.getOptionalForList(Arrays.asList(new Integer[]{10,null,78,90,null}));
	
	
	
	}

}
