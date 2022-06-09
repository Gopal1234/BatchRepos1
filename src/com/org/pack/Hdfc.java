package com.org.pack;

import java.util.Date;

public class Hdfc  extends RbiBank{

	
	
	public Hdfc(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void displayDate() {

System.out.println(new Date());
		
	}

	@Override
	boolean getBanking(RbiBank rbi) {
		// TODO Auto-generated method stub
		if(rbi instanceof Hdfc)
		{
			return true;
		}
		return false;
		
		
		
		
	}
}
