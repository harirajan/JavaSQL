package com.myPackage.myJava.myException;

public class MyFirstException extends Exception {

	public MyFirstException() {
		System.out.println("no - arg constructor");
	}

	public MyFirstException(String arg) {
		super(arg);
	}
}
