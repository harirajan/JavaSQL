package com.myJava.myStudy;

public class snippet1 implements Runnable {
	 int num = 0;

	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (name.equals("Thread1")) {
			num = 10;
		} else {
			System.out.println("value of num is :" + num);
		}

	}

	public static void main(String args[]) throws InterruptedException {
		Runnable r = new snippet1();
		Thread t1 = new Thread(r);
		t1.setName("Thread1");
		t1.start();

		Thread.sleep(1000);

		Thread t2 = new Thread(r);
		t2.setName("Thread2");
		t2.start();
	}
}