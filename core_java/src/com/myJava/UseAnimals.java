package com.myJava;

class Animal1 {
	public void eat() {
		System.out.println("Animal eating");
	}
}

class Horse1 extends Animal1 {
	public void eat() {
		System.out.println("Horse eating");
	}
}

public class UseAnimals {
	
	public void doStuff(Animal1 a) {
		System.out.println("do stuff animal");
	}
	public void doStuff(Horse1 h) {
		System.out.println("do stuff horse");
	}
	public static void main(String[] args) {

		Animal1 a = new Animal1();
		Horse1 h = new Horse1();
		UseAnimals uA = new UseAnimals();
		uA.doStuff(a);
		uA.doStuff(h);
		Animal1 a1 = new Horse1();
		//Horse1 h1 = new Animal1();
		uA.doStuff(a1);
		

	}
}
