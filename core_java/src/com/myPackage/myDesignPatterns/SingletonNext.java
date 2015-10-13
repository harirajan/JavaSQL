package com.myPackage.myDesignPatterns;

public class SingletonNext {
	private static SingletonNext uniqueInstance = new SingletonNext();

	private SingletonNext() {

	}

	public static SingletonNext getInstance() {

		return uniqueInstance;
	}

}
