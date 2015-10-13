package com.myJava.myException;

public class MyFirstException extends Exception {

	String str = "MyFirstException";
	public MyFirstException() {
		System.out.println("no - arg constructor");
	}

	public MyFirstException(String arg) {
		str = arg;
	}
}
