package com.myJava;

public class Static {
	static {
		int x = 5;
	}
	static int x, y;

	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x + y + ++x);

		// StaticTesting.

	}

	public static void myMethod() {
		y = x++ + ++x;
	}
}
