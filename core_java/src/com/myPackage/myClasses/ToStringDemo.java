package com.myPackage.myClasses;

class TestClass1{
	
	public String toString() {
		
		return "Hello";
	}
}
public class ToStringDemo {
	
	public static void main(String[] args) {
		
		TestClass1 tc = new TestClass1();
		System.out.println(""+tc);
	}

}
