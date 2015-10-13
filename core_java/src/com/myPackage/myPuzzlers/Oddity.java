package com.myPackage.myPuzzlers;

public class Oddity {

	public static void main(String[] args) {

		System.out.println(isOdd(1));
		System.out.println(isOdd(2));
		System.out.println(isOdd(-1));
		System.out.println(isOdd(-2));

		System.out.println(1 / 2 * 2 + (1 % 2));
		double d =1.1;
		System.out.println(d);
		Double d1 = new Double(1.1);
		System.out.println(2.00-1.10);
	}

	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

}
