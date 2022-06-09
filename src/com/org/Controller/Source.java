package com.org.Controller;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
	HashMap<String,ArrayList<String>> mobiles=new HashMap<>();
	public String addMobile(String company,String model){
		ArrayList<String>modelList=new ArrayList<String>();
		
		if(!mobiles.containsKey(company))
		{
			modelList.add(model);
			mobiles.put(company,modelList);
		
		}
		
			StringBuffer sb=new StringBuffer();
			sb.append(model);
			String newModel=sb.toString();
			modelList.add(newModel);
			return "model successfully added";
			
		
	}
	public ArrayList<String> getModels(String company){
		for(Map.Entry<String, ArrayList<String>> me:mobiles.entrySet()) {
			String companyKey=me.getKey();
			if(companyKey.equals(company))
				return me.getValue();
		}
		return null;
	}
	public String buyMobile(String company, String model){
		int flag=0;
		
		Iterator<String> itr=mobiles.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			if(key.equalsIgnoreCase(company))
			{
				ArrayList<String> values=mobiles.get(key);
				for(String s:values)
				{
					if(s.equals(model))
					{
						values.remove(s);
						flag=1;
						break;
					}
				}
				//break;
				
			}
		}
		System.out.println(flag);		if(flag==1)
		{
				return "mobile sold successfully";
		}
		
				return "item not available";
			
		//return "item not available";
	}
}

public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModels("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K3"));
		
		
	}
}