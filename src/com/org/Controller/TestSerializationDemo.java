package com.org.Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/*
 * 
 * 
 * Serialization is a technique by which we can convert the state of the object into byte stream
 * from one app to other application
 * new Customer()--custobj--name,phone, email,username, password
 * byte stream-
 * Hibernate java appplication 
 * 
 * DeSerialization that object  byte to object
 * class Customer
 * {
 * 
 * String customerName;
 * long phone;
 * String emial;
 * String userName;
 * String password;
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 */
//100 customerinfo, payment, order, suppler, product ,
/*
 * 
 * custonerObj instanceOf Serializaable
 * writeObject() ObjectOutputStream
 * Collections.sort(list)---Comaprable
 * 
 */
class CustomerInfo implements Serializable
{
	//30 attributes
	// 20 I do not know 
	transient  int customerId;
	 private long phone;
	transient private String userName;
	private String password;
	public int getCustomerId() {
		return customerId;
	}
	public long getPhone() {
		return phone;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setPhone(long phone) {
		phone = phone;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
 }

class CustomerBO
{
	static OutputStream output;
	//FileOutSTream(D:/abc
	public static void setFile(OutputStream output1)
	{
	output=output1;
	}
	//sender
	public static  void serializeCustomer() throws IOException
	{
		//image
		//FileOutputStream
		
		//ObjectOutputStream(OutputStream output)
		
		ObjectOutputStream objOut=new ObjectOutputStream(output);
		
		CustomerInfo customer=new CustomerInfo();
		customer.setCustomerId(108);
		customer.setUserName("abc");
		customer.setPassword("13123absdfs");
		customer.setPhone(234242);
		
		
		// void writeObject(Object objecr)
		//writeObject(
		
		objOut.writeObject(customer);
		
		System.out.println("Customer object serialized");
		
		
	}
	//Receiver
	public static  void deSerialize(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//ObjectInputStream(InputStream input)
		ObjectInputStream input=new ObjectInputStream(new FileInputStream(filePath));
		//readObject()---Object
	CustomerInfo custobj=	(CustomerInfo)input.readObject();
	System.out.println(custobj.getCustomerId() + " "+custobj.getUserName() + " "+custobj.getPassword() + " "+custobj.getPhone());
		
		
		
		
	}
	
	
	
}







public class TestSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		OutputStream out=new FileOutputStream("D:/cust_ser_2.txt");
		CustomerBO .setFile(out);
		//cbo.setFile(out);
		//cbo.serializeCustomer();
	//deSerialize("D:/cust_ser_2.txt");

	}

}
