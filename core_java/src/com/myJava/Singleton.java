package com.myJava;

import java.io.Serializable;


public class Singleton implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Singleton singletonInstance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

	protected Object readResolve() {
		
		return singletonInstance;
	}
}
