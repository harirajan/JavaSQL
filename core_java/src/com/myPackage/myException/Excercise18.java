package com.myPackage.myException;

//: exceptions/LostMessage.java
//How an exception can be lost.

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class SecondLevelException extends Exception {
	public String toString() {
		return "A Second level exception";
	}
}
public class Excercise18 {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		try {
			System.out.println("the first try block");
			
		try {
			Excercise18 lm = new Excercise18();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} finally{
			System.out.println("its again finally");
			throw new SecondLevelException();
		}}catch(Exception e) {
			System.out.println("caught the exception "+e);
			
		}
	}
} /*
 * Output: A trivial exception
 */// :~
