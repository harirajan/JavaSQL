package com.myPackage.myPolymorphism;

import static com.myPackage.myStaticClasses.Print.print;

public class Circle extends Shape {
	
	private int one =1;
	public void draw() {
		print("Drawing a Circle");
	}

	public void erase() {

		print("Erasing a Circle");
	}

}
