package com.myPackage.myException;

public class Excercise2 {

	public static void main(String[] args) {

		String s1 = null;
		try {

			s1.contains("a");
		} catch (Exception e) {

			System.out.println("Inside the Catch Block. Printing the StackTrace()");
			e.printStackTrace();
		}
	}

}
