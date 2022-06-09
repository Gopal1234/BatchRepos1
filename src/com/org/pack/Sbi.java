package com.org.pack;

import java.util.Date;

//tset our components
//debug
public class Sbi  extends RbiBank{
	
	
	
	
	public Sbi(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean getBanking(RbiBank rbi) {
		// TODO Auto-generated method stub
		if(rbi instanceof Sbi)
		{
			return true;
		}
		return false;
		
		
		
		
	}

	@Override
	public void displayDate() {

System.out.println(new Date());
		
	}

}
