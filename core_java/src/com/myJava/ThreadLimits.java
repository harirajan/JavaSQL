package com.myJava;

public class ThreadLimits extends Thread {
	static volatile int x;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int temp = x;
			temp++;
			x = temp;
			System.out.println(Thread.currentThread().getName() + "==== " + x);
		}
		System.out.println("x is ::::: " + x);

	}

	public static void main(String[] args) {
		Thread t1 = new ThreadLimits();
		Thread t2 = new ThreadLimits();
		t1.setName("one");
		t2.setName("two");
		t1.start();
		t2.start();

		// System.out.println(x);
		// ThreadLimits tl = new ThreadLimits();

	}

}
