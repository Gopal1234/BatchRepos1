package org.exception.pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionDemo3 {

	public static void main(String[] args) {
//100  --{jdbc api, thread, file co
        try
        {
        	
        	FileOutputStream fout=new FileOutputStream("D://xyz.txt");
        
        	fout.write("Hello".getBytes());
        	
        	try
        	{
        		
        		//Thread.sleep(-1);
        		//System.out.println("Hi");
        		Scanner scanner=new Scanner(System.in);
        		System.out.println("Enter number");
        		int num=scanner.nextInt();
        		FileInputStream fin=new FileInputStream("G://abc.txt");
        		
        		
        		
        		
        	}catch(InputMismatchException ie)
        	{
        		System.out.println("error in inputs");
        	}
        	catch(IOException ie)
        	{
        		System.out.println("error in files");
        	}
        	
        	
        	
        	
        	
        	
        }catch(IOException e)
        {
        	System.out.println("error in program"+ " "+e.getMessage());
        }
		
		
		
		
		
	}

}
