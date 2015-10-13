package com.myJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedClass {
	private final Lock theLock = new ReentrantLock();
	public void firstMethod() {
		theLock.lock();
		

		for (int i = 0; i < 10000000; i++) {
			//if(i == 1)
			//System.out.println("yes" + Thread.currentThread().getName());
			if (i == 99999) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException iE) {

				}
				//System.out.println("yes" + Thread.currentThread().getName());
			}
		}
		System.out.println("firstMethod synchronized");
		theLock.unlock();
	}

	public synchronized static void secondMethod() {
		System.out.println("secondMethod synchronized");
	}

	public void thirdMethod() {
		System.out.println("thirdMethod non synchronized");
	}
}
