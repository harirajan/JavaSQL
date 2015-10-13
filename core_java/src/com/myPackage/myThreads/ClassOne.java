package com.myPackage.myThreads;

import com.myPackage.myThreads.ThreadOne;

class ThreadOne extends Thread {

	public void run() {
		System.out.println("Inside the run method()");
		System.out.println(Thread.currentThread().getName());
	}

}

public class ClassOne {

	public static void main(String[] args) {
		Object o;
		ThreadOne t = new ThreadOne();
		//t.start();
		t.run();
		//t.run();
		//System.out.println(t.currentThread().getName());
		System.out.println(Thread.currentThread().getName());

	}

}

