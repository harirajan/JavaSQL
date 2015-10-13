package com.myPackage.myException;

class NewException extends Exception {
}

class SecondNewException extends Exception {
}

public class Excercise10 {

	public void f() throws SecondNewException {
		try {
			g();
		} catch (NewException ne) {
			System.out.println("Caught NewException: " + ne.getMessage());
			throw new SecondNewException();
		}
	}

	public static void g() throws NewException {
		
		throw new NewException();
	}

	public static void main(String[] args) throws SecondNewException {

		Excercise10 e10 = new Excercise10();
		try {
			e10.f();
		} catch (SecondNewException snE) {
			System.out.println("Catching the Second New Exception: " + snE.getMessage());
		}

	}
}
