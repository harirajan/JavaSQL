package com.myJava;

public class StaticTesting {
	static {
		System.out.println("its the static block");
	}

	static private int i;
	private int k;
	private boolean b;

	/*
	 * static { System.out.println("its the static block"); }
	 */

	public static void main(String[] args) {

		StaticTesting sT = new StaticTesting();
		sT.myMethod();
	}

	public void myMethod() {
		int j = 0;
		System.out.println("print the static variable: " + i);
		System.out.println("print the non static variable: " + k);
		System.out.println(j);
	}

	static private void myMethod1() {
		System.out.println("print the static variable: " + i);
		// System.out.println("print the non static variable: " + k);
	}
}
