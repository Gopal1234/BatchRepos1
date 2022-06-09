package com.org.Controller;
class Superclass {
	Superclass() {
		this(0);
		System.out.println("1");
	}
	Superclass(int x) {
		System.out.println("2"+x);
	}
}
public class Subclass1 extends Superclass {
	Subclass1(int x) {

		System.out.println("3"+ x);
	}
	Subclass1(int x, int y) {

		this(x);
		System.out.println("4"+ x + y);
	}
	public static void main(String[] args) {
		new Subclass1(2,3);
	}
}