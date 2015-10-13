package com.myPackage.myException;

class FailingConstructorException extends Exception {
}

public class Excercise22 {

	public Excercise22() throws FailingConstructorException {
		throw new FailingConstructorException();
	}

	public static void main(String[] args) {
		try {
			Excercise22 e22 = new Excercise22();
		} catch (FailingConstructorException fce) {
			System.out.println("Caught the Exception :" + fce.getMessage());
		}
	}
}
