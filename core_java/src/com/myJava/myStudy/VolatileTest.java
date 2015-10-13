package com.myJava.myStudy;

public class VolatileTest {
	
	static int intVar = 0;
	
	public static void main(String[] args) {
		
		ThreadA tA = new ThreadA();
		tA.start();
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(intVar);
		
	}

}
