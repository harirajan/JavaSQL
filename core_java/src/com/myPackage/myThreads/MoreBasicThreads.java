package com.myPackage.myThreads;

public class MoreBasicThreads {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new LiftOff());
			t.start();
		}
	}
}
