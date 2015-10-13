package com.myPackage.myException;

//The Exception Packages
/*class BaseException extends Exception {
 }

 class ExceptionEk extends BaseException {
 }

 class ExceptionDo extends BaseException {
 }

 class ExceptionTheen extends BaseException {
 }*/

public class Excercise13 {

	public static void f() throws ExceptionEk, ExceptionDo, ExceptionTheen {

		throw new ExceptionEk();
	}

	public static void newF() {

		throw new NullPointerException();
	}

	public static void main(String[] args) {

		try {

			f();
			newF();
		} catch (BaseException baseException) {

			System.out.println("Caught the BaseException: " + baseException.getClass());
		} catch (Exception exception) {
			System.out.println("Caught the Exceptin: " + exception.getMessage());
		} finally {
			System.out.println("in the finally clause");
		}

	}
}
