package com.org.pack2;

import java.util.Scanner;

import com.org.pack.SalaryCalculator;


public class Main 
{

	public static void main(String[] args) {

SalaryCalculator sc;
sc =new Wipro();//loosely couple
		//Wipro wipro=new Wipro();
		
Scanner scanner=new Scanner(System.in);


double salaryAmt_Wipro=wipro.calculateSalary(120000.00, 500.00, 5000.00, 3000.00, 7000.00, 1500.00);
System.out.println(salaryAmt_Wipro);
sc=new Capgemeini();
sc.display();

double salaryAmt_Capgemini=sc.calculateSalary(150000.00, 800.00, 4000.00, 7000.00, 2000.00, 1500.00);
System.out.println(salaryAmt_Capgemini);		
		
		sc.display();
		
	}

}
