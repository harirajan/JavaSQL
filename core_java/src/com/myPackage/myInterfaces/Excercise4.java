package com.myPackage.myInterfaces;

abstract class One{
	
	//abstract void addedMethod();
}

class Two extends One{
	
	public void addedMethod() {
		
		System.out.println("inside the added method");
		
	}
	
	
}
public class Excercise4 {
public static void theMethod() {
		
		One one = new Two();
		Two two = (Two)one;
		two.addedMethod();
		//Two two = new One();
	}
	public static void main(String[] args) {
		
		theMethod();
	}

}
