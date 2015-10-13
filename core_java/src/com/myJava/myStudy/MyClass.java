package com.myJava.myStudy;

public class MyClass implements MyInterface {

	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("myMethod");

	}

	public void mySecondMethod() {
		// TODO Auto-generated method stub
		System.out.println("mySecondMethod");

	}

	public static void main(String[] args) {

		MyInterface mI = new MyClass();
		System.out.println(mI.getClass());
		System.out.println(mI instanceof MyClass);
	}

}
