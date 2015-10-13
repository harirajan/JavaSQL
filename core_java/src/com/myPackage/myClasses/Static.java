package com.myPackage.myClasses;

public class Static {
	static int x=0;
	static int y;

	static {
		System.out.println(y);
		int x = 5;
	}
	
	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x + y + ++x);
	}

	public static void myMethod() {
		y = x++ + ++x;
	}
}
