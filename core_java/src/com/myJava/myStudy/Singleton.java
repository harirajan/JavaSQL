package com.myJava.myStudy;

public class Singleton {

	public static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (singleton == null) {

			singleton = new Singleton();
		}

		return singleton;

	}
}
