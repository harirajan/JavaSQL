package com.myPackage.myClasses;

public class Groundhog2 extends Groundhog {

	public int hashCode() {
		return number;
	}

	public Groundhog2(int n) {
		super(n);
	}

	public boolean equals(Object o) {
		return o instanceof Groundhog2 && (number == ((Groundhog2) o).number);
	}

}
