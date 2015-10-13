package com.myJava;

public class TestOne {

	public static void main(String[] args) {

		String a = "abc";
		String b = "abc";
		// System.out.println(a == b);
		System.out.println("The Strings are equal:" + a == b);

		double initialAmount = 10.05;
		System.out.println("After expense: " + (initialAmount - .04));

		MyInterface myClass = new MyNewClass();
		myClass.myMethod();
	}

}
