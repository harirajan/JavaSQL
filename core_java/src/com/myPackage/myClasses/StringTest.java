package com.myPackage.myClasses;

public class StringTest {

	public static void main(String[] args) {

		
		String a= "abc";
		String b = new String("abc");
		String c = "abc";
		System.out.println("Test a: "+a);
		System.out.println("Test b: "+b);
		System.out.println(a.equals(b)); //true
		System.out.println(a == b); //false
		System.out.println(a == c); //true
		//StringBuffer sb = "abc";
		
		
	}
}
