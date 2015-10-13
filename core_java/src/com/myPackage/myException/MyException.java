package com.myPackage.myException;

import static com.myPackage.myStaticClasses.Print.print;

public class MyException extends Exception {

	public MyException() {
		print("helloooo");
	}

	public MyException(String msg) {
		super(msg);
		print();

	}

}
