package com.myJava;

public class PassByValueExample {

	
	public static void  foo1(Dog d) {
		  d.name.equals("Max"); // true
		  d = new Dog("Fifi");
		  d.name.equals("Fifi"); // true
		}
	
	public static void foo2(Dog d) {
		  d.name.equals("Max"); // true
		  d.setName("Fifi");
		}

	
	public static void main(String[] args) {
		
		Dog aDog = new Dog("Max");
		foo1(aDog);
		System.out.println(aDog.name.equals("Max"));
		
		Dog bDog = new Dog("Max");
		foo2(bDog);
		System.out.println(bDog.name.equals("Fifi")); 
	}
}
