package com.org.pack2;


import com.org.pack.ABC;
import com.org.pack.SalaryCalculator;

public class Wipro implements SalaryCalculator,ABC {

	@Override
	public double calculateSalary(double basicPay, double pf, double hra, double ta, double ma, double tds) {
		// TODO Auto-generated method stub
		double sal=(basicPay+hra+ma)-(pf+tds);
		return sal;
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}

}
