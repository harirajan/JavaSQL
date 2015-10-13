package com.myJava;

public class PandCTest {

	public static void main(String[] args) {
		Basket b = new Basket();
		P p = new P(b, 1);
		C c = new C(b, 1);
		p.start();
		c.start();
		
	}

}

class P extends Thread {
	Basket b;
	int i;

	public P(Basket b, int i) {

		this.b = b;
		this.i = i;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			b.put(i);
			System.out.println("putting : " + i);
			try {

				sleep((int) (Math.random() * 600));
			} catch (InterruptedException e) {
			}
		}
		System.out.println(b.s1);
	}

}

class C extends Thread {

	Basket b;
	int i;

	public C(Basket b, int i) {

		this.b = b;
		this.i = i;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {

			value = b.get();
			b.s1 ="test1";
			System.out.println("got value: "+value);

		}
	}
}

class Basket {

	private int contents;
	private boolean available;
	String s1 ="demo"; 
	public synchronized void put(int value) {

		if (available == true) {
			try {
				wait();
			} catch (InterruptedException ie) {
			}

		}
		contents = value;
		available = true;
		notifyAll();

	}

	public synchronized int get() {

		if (available == false) {
			try {
				wait();
			} catch (InterruptedException ie) {
			}

		}
		// contents = value;
		available = false;
		notifyAll();
		return contents;

	}

}