package com.myPackage.myThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDaemons implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread() + " " + this);

	}

	public static void main(String[] args) {

		// ExecutorService exec = Executors.newCachedThreadPool();
		/*
		 * for (int i = 0; i < 40; i++) { Thread t = new Thread(new
		 * SimpleDaemons()); t.setDaemon(true); t.start(); }
		 */
		// xec.execute(new SimpleDaemons());
		// Using Factory
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 10; i++)
			exec.execute(new SimpleDaemons());

	}
}
