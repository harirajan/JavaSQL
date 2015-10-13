package com.myPackage.myException;

class ResumerException extends Exception {
}

class Resumer {

	static int count = 3;

	static void f() throws ResumerException {

		if (--count > 0)
			throw new ResumerException();
	}
}

public class Excercise5 {

	public static void main(String[] args) throws ResumerException {

		System.out.println("This is just a try....");
		while (true) {
			try {
				Resumer.f();
			} catch (ResumerException re) {
				System.out.println("caught the exception" + re.getClass());
				continue;

			}
			break;

		}
	}
}
