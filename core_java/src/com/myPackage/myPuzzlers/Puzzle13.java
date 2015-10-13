package com.myPackage.myPuzzlers;

public class Puzzle13 {

	public static void main(String[] args) {

		final String pig = "length: 10";
		final String dog = "length: " + pig.length();

		System.out.println("Animals are equal:" + pig == dog);

		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
	}
}
