package com.myPackage.headFirst.myThreads;

class A implements Runnable{
	
	public void run() {
		go();
	}
	public void go() {
		last();
	}
	public void last() {
		System.out.println("in the last method()");
	}
}

public class ThreadTestDrive {
	
	public static void main(String[] args) {
		
		A a = new A();
		Thread t = new Thread(a);
		t.start();
		System.out.println("back in main");
	}

}
