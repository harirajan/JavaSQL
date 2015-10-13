package com.myPackage.myExcercises;

public class ThreadExcercise1 {

	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			Excercise1Thread exThread = new Excercise1Thread(j+ "th Thread");

			Thread newThread = new Thread(exThread);
			//ewThread.setName(j+ "th Thread");
			newThread.start();
		}
	}

}
