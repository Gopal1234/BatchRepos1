package com.org.Controller;
 class Invoice {
	public static String formatId(String oldId) {
		return oldId + "_Invoice";

	}
}
 class SalesInvoice extends Invoice {
	public static String formatId (String oldId) {
		return oldId + "_SalesInvoice";
	}
}

public class TestQ3
{
public static void main(String[] args)
{

Invoice invoice = new Invoice();
SalesInvoice sal=(SalesInvoice)invoice;
sal.formatId("1234");
//System.out.println((SalesInvoice)Invoice.formatId("1234"));
SalesInvoice invoice1 = new SalesInvoice();
System.out.println(Invoice.formatId("1234"));


}
}