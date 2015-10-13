package com.myPackage.myPuzzlers;

public class Puzzle40 {

	private Puzzle40 internalInstance = new Puzzle40();

	public Puzzle40() {

		//throw new Exception("throwing the exception");
	}

	public static void main(String[] args) {
		try {

			Puzzle40 p40 = new Puzzle40();
			System.out.println("Surprise!");
		} catch (Exception e) {

			System.out.println("Inside the catch block");
		}

	}
}
