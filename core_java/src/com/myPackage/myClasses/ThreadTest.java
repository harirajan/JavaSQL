package com.myPackage.myClasses;

public class ThreadTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadA threadA = new ThreadA();
		Thread thread = new Thread(threadA);
		thread.setName("Hari");
		thread.start();
		//thread.run();

	}
}

class ThreadA implements Runnable {

	public void run() {

		System.out.println("Starting the Thread");
		System.out.println(Thread.currentThread().getName());
	}
}
