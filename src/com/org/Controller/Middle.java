package com.org.Controller;

import java.util.Scanner;

public class Middle {

	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		if(s.length()%2==0)
		{
	      sb.append(s.substring(s.length()/2-1,s.length()/2+1));
	      //System.out.println(sb.toString());
			
		}
		System.out.println(sb.toString());
	}

}


