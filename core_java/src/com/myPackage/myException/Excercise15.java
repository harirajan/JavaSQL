package com.myPackage.myException;

//: exceptions/WithFinally.java
//Finally Guarantees cleanup.

public class Excercise15 {
	static Switch sw = new Switch();

	public static void main(String[] args) {
		try {
		try {
			sw.on();
			// Code that can throw exceptions...
			Excercise14.f();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
		} catch (OnOffException2 e) {
			System.out.println("OnOffException2");
		} finally {
			System.out.println("Inside the finally block");
			sw.off();
		}}catch(RuntimeException re) {
			System.out.println("did the switch got turned off? " +sw);
		}
	}
} /*
 * Output: on off
 */// :~

