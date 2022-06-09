package com.org.pack2;

import com.org.pack.SalaryCalculator;

public class Capgemeini implements SalaryCalculator{
	@Override
	public double calculateSalary(double basicPay, double pf, double hra, double ta, double ma, double tds) {
		// TODO Auto-generated method stub
		double sal=(basicPay+hra+ma)-(pf+tds);
		return sal;
	}

}
