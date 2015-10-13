package com.myPackage.myException;

class MyException1 extends RuntimeException {

	private String s = null;

	public MyException1() {};
	public MyException1(String msg) {
		this.s = msg;

	}

	public void printString() {
		System.out.println("the stored string is: " + s);
	}
}

public class Excercise4 {
	public static void main(String[] args) {

		//try {
			throw new MyException1("Hello");

//		} catch (MyException1 e) {
//			e.printString();
//		}
	}

}
