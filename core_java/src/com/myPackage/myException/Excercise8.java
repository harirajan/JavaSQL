package com.myPackage.myException;

public class Excercise8 {

	public void f() throws MyException1 {

		throw new MyException1("One");
	}

	public static void main(String[] args) {

		try {
			Excercise8 e8 = new Excercise8();
			e8.f();
		} catch (MyException1 mE) {

			mE.printString();
		}
	}
}
