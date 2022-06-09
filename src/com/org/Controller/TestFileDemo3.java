package com.org.Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Player implements Serializable
{

private int playerId;
private String palyerName;
public Player(int playerId, String palyerName) {
	super();
	this.playerId = playerId;
	this.palyerName = palyerName;
}
public int getPlayerId() {
	return playerId;
}
public String getPalyerName() {
	return palyerName;
}


}
public class TestFileDemo3 {
	public static void deSerialization() throws IOException, ClassNotFoundException
	{
		  FileInputStream fin=new FileInputStream("D:/playerInfo1.txt");
			ObjectInputStream input=new ObjectInputStream(fin);
			//Player p=null;
			int k=0;
		//	Player p=(Player)input.readObject();
			//System.out.println(p.getPlayerId() + " "+p.getPalyerName());
			//System.out.println("hi");
			System.out.println(fin.available());
			Player p1=null;
			//fin.re
			 while((k=fin.available())!=0)
			 {
				 
	p1=(Player)input.readObject();
				/*if(p1!=null)
				{*/
				System.out.println(p1.getPalyerName() + " "+p1.getPlayerId()); 
			//	}*/
				
			 }
	input.close();	
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
   List<Player> list=new ArrayList();
   list.add(new Player(1, "A"));
   list.add(new Player(2, "B"));
   list.add(new Player(3, "C"));
   //Charcter data --text, number--FileWriter
   //Binary data--text, number, image, audio,video--OutStream<Abstract class> FileOutStream
   
   
  // OutputStream output=new FileOutputStream("D:/playerInfo.csv", true);
   
   //Write(int byte)
   //write(byte[] b)
   
   FileOutputStream writer=new FileOutputStream("D:/playerInfo1.txt",true);
   ObjectOutputStream out=new ObjectOutputStream(writer);
   
  //write(int c)
   //write(String c)
   //write(char[] ch)
    for(Player p:list)
    {
    	/*int pId=p.getPlayerId();
    	String playerId=String.valueOf(pId);
    	String pname=p.getPalyerName();
    	writer.write(String.valueOf(pId));
    	writer.write(",");
    	writer.write(pname);
    	writer.write("\n");*/
    	
    	
    	out.writeObject(p);
    	//output.write(playerId.getBytes());
    //	output.write(",".getBytes());
    	//output.write(pname.getBytes());
    	//output.write(",".getBytes());
    	//output.write("\n".getBytes());
    	
    	
    	
    }
    writer.close();
    deSerialization();
		
        
	}

}
