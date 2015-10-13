package com.myJava;

public class SynchTesting {

	public static void main(String[] args) {

		SynchronizedClass sClass = new SynchronizedClass();
		SynchronizedTesting1 sT1 = new SynchronizedTesting1(sClass);
		SynchronizedTesting2 sT2 = new SynchronizedTesting2(sClass);
		Thread t1 = new Thread(sT1);
		Thread t2 = new Thread(sT2);
		t1.start();
		t2.start();
		
		
	}

}
