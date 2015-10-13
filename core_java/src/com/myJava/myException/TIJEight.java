package com.myJava.myException;

public class TIJEight {

	public static void main(String[] args) {
		try {
			testFunction();
		} catch (MyFirstException mfE) {
			mfE.getMessage();
		}
	}

	public static void testFunction() throws MyFirstException {

		throw new MyFirstException();
	}
}
