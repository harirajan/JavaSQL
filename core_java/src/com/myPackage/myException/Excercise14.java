package com.myPackage.myException;

//: exceptions/OnOffSwitch.java
//Why use finally?

public class Excercise14 {
	private static Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2 {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		try {
			sw.on();
			// Code that can throw exceptions...
			f();
			sw.off();
			throw new RuntimeException();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		} catch (OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
			System.out.println(sw);
		}
	}
} /*
 * Output: on off
 */// :~
