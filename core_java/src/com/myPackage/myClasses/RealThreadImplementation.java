package com.myPackage.myClasses;

public class RealThreadImplementation {

	public static void main(String[] args) {

		LiftOff liftOff = new LiftOff();
		Thread myThread = new Thread(liftOff);
		myThread.start();

	}

}
