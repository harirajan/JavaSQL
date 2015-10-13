package com.myJava;

public class SingleTonTesting {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
