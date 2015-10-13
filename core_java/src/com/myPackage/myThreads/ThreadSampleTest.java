package com.myPackage.myThreads;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Test {
	private Lock testLock = new ReentrantLock();
	//private ThreadSampleTest tsT = new ThreadSampleTest();
	LinkedList al = new LinkedList();
	boolean containsElement = false;
	int i;

	public void get() {
		// System.out.println("hashcode get " + this.hashCode());
		System.out.println("removing the element...");
		//synchronized(this) {
		testLock.lock();
		try {
		if (!containsElement)

			try {
				System.out.println("waiting....");
				wait();
			} catch (InterruptedException ie) {
			}

		// notifyAll();
		// if (containsElement) {
		System.out.println("removing... " + al.getLast());
		try {
			System.out.println("waiting....");
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		al.removeLast();
		System.out.println("removed...");
		// if (al.isEmpty())
		containsElement = false;
		}
		finally {
			testLock.unlock();
			notify();
		}
		// }

	}

	public void put(int n) {
		// System.out.println("hashcode put " + this.hashCode());
		System.out.println("putting the element");
		// for (int i = 0; i < 200; i++) {
		testLock.lock();
		try {
			
		
		if (containsElement)
			try {
				System.out.println("waiting....");
				wait();
			} catch (InterruptedException ie) {
			}

		System.out.println("adding..." + n + "th");
		try {
			System.out.println("waiting....");
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		al.add(n + "th");
		System.out.println("added....");
		// i++;
		/*
		 * try { System.out.println("sleeping...."); Thread.sleep(3000); } catch
		 * (InterruptedException ie) { }
		 */
		containsElement = true;
		// System.out.println("hashcode put " + this.hashCode());
		
		}finally {
			testLock.unlock();
			notify();
			
		}
		// }

	}
}

public class ThreadSampleTest {

	// static boolean containsElement = false;

	public static void main(String[] args) {
		Test t = new Test();
		Producer pro = new Producer(t);
		Consumer con = new Consumer(t);
		pro.start();
		con.start();

	}
}

class Consumer extends Thread {
	// private final LinkedList al1;
	Test test;

	// private constainElement =

	public Consumer(Test test) {
		this.test = test;
	}

	@Override
	public void run() {

		// System.out.println("notified...");
		while (true)
			test.get();
		// System.out.println("removed the element");
		// System.out.println("size of the list is: " + al1.size());
		/*
		 * if (al1.isEmpty()) ThreadSampleTest.containsElement = false;
		 */

	}
}

class Producer extends Thread {
	// private final LinkedList al1;
	Test test;
	int i;

	public Producer(Test al) {
		this.test = al;
	}

	@Override
	public void run() {
		/*
		 * try { wait(); } catch (InterruptedException ie) {
		 * 
		 * }
		 */
		System.out.println("Adding the lements in...");
		// synchronized (Test.class) {
		while (true)
			test.put(i++);

		// }
		// Test.containsElement = true;
		// System.out.println("The list contains : " + al1.size());
	}
}