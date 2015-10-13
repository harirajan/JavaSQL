package com.myJava.myStudy;

public class SingletonDemo {

	// Singleton singleTon= new Singleton();

	public static void main(String[] args) {
		ThreadA tA = new ThreadA();
		tA.start();
		ThreadB tB = new ThreadB();
		tB.start();

	}

}
