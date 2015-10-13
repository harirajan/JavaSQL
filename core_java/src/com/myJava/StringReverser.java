package com.myJava;

public class StringReverser {

	public static void main(String[] args) {

		System.out.println("" + reverse("harirajan"));

	}

	public static String reverse(String s) {

		if ((s == null) && s.length() <= 1) {
			return s;
		}

		return new StringBuffer(s).reverse().toString();
	}
}
