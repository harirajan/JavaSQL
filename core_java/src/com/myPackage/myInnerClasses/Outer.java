package com.myPackage.myInnerClasses;

public class Outer {

	private String stringField;

	public Outer(String arg) {
		this.stringField = arg;
	}

	class Inner {

		public Inner() {
			System.out.println("inside the constructor inner");
		}

		public String toString() {

			return "the stringField is : " + stringField;
		}
	}

	public Inner returnInner() {

		return new Inner();

	}

	public static void main(String[] args) {

		Outer.Inner in = new Outer("TExt").returnInner();
		System.out.println(in);
	}

}
