package com.myJava;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		Animal a = new Horse();
		//a.eat("Hari");
		PolymorphismTest pT = new PolymorphismTest();
		pT.method("Hari");

	}
	
	public void method(String a) {
		
		System.out.println("Its a string");
	}
	
	public void method(Object a) {
		System.out.println("Object a");
	}
}
