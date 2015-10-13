package com.myJava.myStudy;

public class ThreadB extends Thread{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton.hashCode());
		}
	}

}
