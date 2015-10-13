package com.myJava;

public class SynchronizedTesting1 implements Runnable {
	private SynchronizedClass synchClass = null;

	public SynchronizedTesting1(SynchronizedClass sC) {
		this.synchClass = sC;
	}

	// SynchronizedClass sClass = new SynchronizedClass();

	public void run() {
		// SynchronizedClass sClass = new SynchronizedClass();

		System.out.println("inside the run method SynchronizedTesting1");

		SynchronizedClass.secondMethod();
		//synchClass.thirdMethod();
	}

	
}
