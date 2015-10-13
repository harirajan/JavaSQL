package com.myJava;

public class SynchronizedTesting2 implements Runnable {
	private SynchronizedClass synchClass = null;

	public SynchronizedTesting2(SynchronizedClass sC) {
		this.synchClass = sC;
	}

	// SynchronizedClass sClass = new SynchronizedClass();

	public void run() {
		 SynchronizedClass sClass = new SynchronizedClass();

		System.out.println("inside the run method SynchronizedTesting2");

		//synchClass.firstMethod();
		sClass.firstMethod();
	}

	
}
