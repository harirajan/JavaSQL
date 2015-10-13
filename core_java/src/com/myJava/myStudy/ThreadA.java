package com.myJava.myStudy;

public class ThreadA extends Thread {

	public void run() {
		
		VolatileTest.intVar = 5;
		System.out.println("over");

		/*for (int i = 0; i < 100; i++) {
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton.hashCode());
		}*/

	}
}
