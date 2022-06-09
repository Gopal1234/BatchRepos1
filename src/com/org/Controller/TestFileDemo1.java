package com.org.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Scanner;
/*
 * java.io.*
 *  |
 *  OutputStream<class>
 *  |
 *  FileOutputStream<class>
 *  BufferedOutputstream<class>
 *  
 *  InputStream<class>
 *  |
 *  FileInputStream<class>
 *  
 * 
 * 
 */

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
      File file=new File("D:/abc.txt");
      /*
       * FileOutStream(File file)throws FileNotFoundException
       * FileOutStream(String path)throws FileNotFoundException
       * FileOutputStream(FileDescriptor s)throws Exception
       * 
       * date feeback
       */
      //using this ouput stream object we can write binary file as wellas character file
      OutputStream output=new FileOutputStream(file,true);
      Scanner scn=new Scanner(System.in);
      LocalDate today=LocalDate.now();
      String todayInString=today.toString();
  byte[] d1=    todayInString.getBytes();
      // write date into file
      output.write(d1);
      //space into file
      output.write(" ".getBytes());
      
   System.out.println("Enter your feedback");
   String msg=scn.nextLine();
   //write the msg to file
   // write(byte[] b)throws IOException
   //writing msg into file
byte[] byteMsg=   msg.getBytes();
   output.write(byteMsg);
   //new line into file
   output.write("\n".getBytes());
   System.out.println("file created at" + " "+file.getAbsolutePath());
      
      InputStream input=new FileInputStream(file);
      int k=0;
     
      while((k=input.read())!=-1)
      {
    	  System.out.print((char)k);
      }
      
      
      
      
      
      
		
		
		
		

	}

}
