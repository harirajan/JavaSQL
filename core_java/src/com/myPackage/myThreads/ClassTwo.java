package com.myPackage.myThreads;

class ThreadTwo implements Runnable {

	public void run() {

		System.out.println("In the run()");
		try {
			Thread.sleep(5*60*1000);
		} catch (InterruptedException ie) {
			// throw new InterruptedException();
		}
		for (int i = 0; i < 1000; i++) {
			System.out.println("inside the run: " + i);
		}
	}
}

public class ClassTwo {

	public static void main(String[] args) {

		ThreadTwo tt = new ThreadTwo();
		Thread t = new Thread(tt);
		t.start();
		System.out.println("Spadikam george");

		for (int i = 0; i < 100; i++) {
			System.out.println("inside the main");
		}

	}
}
