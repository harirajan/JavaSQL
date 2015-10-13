package com.myJava.myException;

public class TIJFive {

	static int count = 3;

	static void f() throws Exception {

		if (--count > 0) {
			throw new Exception();
		}
	}

	public static void main(String[] args) {

		while (true) {
			try {
				TIJFive.f();
			} catch (Exception e) {
				System.out.println("Exception occured");
				continue;
			}
			System.out.println("got through");
			break;
		}
		System.out.println("excecuted successfully");
	}

}
