package com.org.pack;

import java.util.Date;

public class Pnb  extends RbiBank {

	public Pnb(String msg)
	{
		super(msg);
	}
	
	@Override
	public void displayDate() {

System.out.println(new Date());
		
	}
	
	@Override
	boolean getBanking(RbiBank rbi) {
		// TODO Auto-generated method stub
		if(rbi instanceof Pnb)
		{
			return true;
		}
		return false;
		
		
		
		
	}

	
	
	
}
