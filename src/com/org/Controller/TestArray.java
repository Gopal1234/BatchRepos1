package com.org.Controller;
/*
 * java.lang
 * 
 * itterface Comaparable
 * {
 * int compareTo(Obejct object)
 * }
 * 
 */

import java.util.Arrays;
class Order implements Comparable
{
	private int orderId;
	private String orderName;
	
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	@Override
	public int compareTo(Object object) {

//object 1 and obejct 2
		 Order order=(Order)object;
		 
		return order.orderName.compareTo(this.orderName);
		 /*if(order.orderId>this.orderId)
		 {
			 return 1;
		 }
		return -1;*/
	}
	
}

public class TestArray {

	 
	Order[] order= {new Order(10, "veg tadka"),new Order(1,"biriyani"), new Order(5,"abc")};
	public Order getId(int id)
	{
		for(int i=0; i<order.length; i++)
		{
			if(order[i].getOrderId()==id)
			{
				return order[i];
			}
		}
		return null;
		
	}
	
	public Order[] sortArray()
	{
		/*
		 * 
		 * asList()
		 * integer, string,
		 */
		//Comparable
		//Arrays.sort(a)
		Arrays.sort(order);
		return order;
	}
	public static void main(String[] args) {

TestArray test=new TestArray();
Order[] result=test.sortArray();
for(int i=0; i<result.length; i++)
{
	System.out.println(result[i].getOrderId() + " "+result[i].getOrderName());
}
//System.out.println(Arrays.toString(result));

	}

}
