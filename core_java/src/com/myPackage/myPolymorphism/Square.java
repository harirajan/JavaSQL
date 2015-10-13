package com.myPackage.myPolymorphism;

import static com.myPackage.myStaticClasses.Print.print;

public class Square extends Shape {
	
	private int one =2;
	public void draw() {
		print("Drawing a Square");
	}

	public void erase() {

		print("Erasing a Square");
	}

}
