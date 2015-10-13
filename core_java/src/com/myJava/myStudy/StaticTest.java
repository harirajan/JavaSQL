package com.myJava.myStudy;

public class StaticTest {
	private int j = 0;
	static int k = 10;
	static {
		System.out.println("inside the static block");
		System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(k);
		//System.out.println(j);
		
	}
	
	
	public void testMethod() {
		
		System.out.println(k);
		System.out.println(j);
	}
}
