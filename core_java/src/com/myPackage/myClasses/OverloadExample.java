package com.myPackage.myClasses;

class House1{
	public void paint() {
		System.out.println("Painting the House.....");
	}
}

class Window1 extends House1{
	public String paint(int a) {
		
		System.out.println("a");
		return "a";
		
	}
}
public class OverloadExample {

}
