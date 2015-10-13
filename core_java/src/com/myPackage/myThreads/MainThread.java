package com.myPackage.myThreads;

public class MainThread {

	public static void main(String[] args) {

		Thread t = new Thread(new LiftOff());
		t.start();
	}
}
