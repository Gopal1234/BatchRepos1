package com.org.Controller;

import java.util.Objects;
import java.util.Scanner;

/*
 * 
 * 
 * Object class
 * 
 * 1.root class of all user define and predefined classes
 * 
 * Methods of Object class
 * equals()
 * hsahCode()
 * clone()
 * toString()
 * wait()
 * notify()
 * notifyAll()
 * finalize()
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//model clasas or java bean class
class Product 
{
	private int productId;
	private String productName;
	private double productOPrice;
	private int pQunatity;
	//either we can define setters method or we can define parameterized constructor
	public Product(int productId, String productName, double productOPrice, int pQunatity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productOPrice = productOPrice;
		this.pQunatity = pQunatity;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductOPrice() {
		return productOPrice;
	}
	public int getpQunatity() {
		return pQunatity;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productOPrice=" + productOPrice
				+ ", pQunatity=" + pQunatity + "]";
	}
	
	
	
}
//business obejct class or service class 
class ProductBO
{
	//multiple objects of product we can store;
	//int[] a
	//String[] str
	Product[] pArray;

	public Product[] getpArray() {
		return pArray;
	}

	public void setpArray(Product[] pArray) {
		this.pArray = pArray;
	}
	
	
	/*public String[] getProducts()
	{
		
	}*/
	
	/*public Product[] sortProduct()
	{
		
	}*/
	
	
	
	/*public Product getProductById(int pId)
	{
		
	}*/
	
	/*public int getTotalPrice(Product[] p)
	{
		
	}*/
	
	
}




public class TestArrayDemo2 {

	public static void main(String[] args) {
    
ProductBO pbo=new ProductBO();
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the size of the product array");
int size=scanner.nextInt();//3
//0 1
//[][]
Product[] pruductArray=new Product[size];

for(int i=0; i<size; i++)
{
	System.out.println("Enter product Id");
	int pId=scanner.nextInt();//2,3
	System.out.println("Enter product name");
	String pName=scanner.next();//A,B
	System.out.println("Enter product price");
	double price=scanner.nextDouble();//34,67
	System.out.println("Enter p Qty.");
	int qty=scanner.nextInt();//5,8
	Product product=new Product(pId, pName, price, qty);//1object of product{1,"A",34,3} //2 nd objectproduct{3,"B",67,8}
	pruductArray[i]=product;
	
}




		pbo.setpArray(pruductArray);
		
	Product[] pList=	pbo.getpArray();
	
	for(int i=0; i<pList.length; i++)
		
	{
		System.out.println(pList[i]);
	}
	/*for(Product p:pList)
	{
		
		System.out.println(p.hashCode());
		System.out.println(p);//compiler is call ToString()
		//System.out.println(p.getProductId() + " "+p.getProductName() + " "+p.getProductOPrice()+ " "+p.getpQunatity());
	}*/
		
		
		

	}

}
