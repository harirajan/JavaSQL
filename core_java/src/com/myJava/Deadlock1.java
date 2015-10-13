/*package com.myJava;

class A {
	synchronized void methodA(B b) {
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside A.last()");
	}
}

class B {
	synchronized void methodB(A a) {
		a.last();
	}

	synchronized void last() {
		System.out.println(" Inside B.last()");
	}
}

class Deadlock1 implements Runnable {
	A a = new A();
	B b = new B();

	// Constructor
	Deadlock1() {
		Thread t = new Thread(this);
		t.start();
		System.out.println("delaying...."); // any instruction to delay
		System.out.println("delaying..."); // any instruction to delay
		for (int i = 0; i < 1000000; i++) {

		}
		a.methodA(b);
	}

	public void run() {
		b.methodB(a);
	}

	public static void main(String args[]) {
		new Deadlock1();
	}
}
*/