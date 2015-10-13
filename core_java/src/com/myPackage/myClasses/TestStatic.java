package com.myPackage.myClasses;

public class TestStatic {
	
	static String str = "abc";
	String str1 = "abcdef";
	
	public static void main(String[] args) {
		
		System.out.println("inside the main method");
		System.out.println(str);
		System.out.println(new TestStatic().str1);
	}
	                                       
	static {
		System.out.println(str);
		System.out.println("This is a static block");
	}
}
