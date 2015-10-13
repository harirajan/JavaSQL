package com.myPackage.myPuzzlers;

class Dog{
	
	public static void bark() {
		System.out.println("dog barking");
	}
}

class Dog1 extends Dog{
	
	public static void bark() {
		
		System.out.println("Dog1 barking");
	}
}

public class Puzzle48 {
	
	public static void main(String[] args) {
		
		Dog1 d1 = new Dog1();
		d1.bark();
		Dog d2 = new Dog();
		d2.bark();
		Dog d3 = new Dog1();
		d3.bark();
	}

}
