package com.myPackage.myInnerClasses;

public class Excercise2 {

	String holdString;

	public Excercise2(String arg) {

		this.holdString = arg;
	}

	public String toString() {

		return "The holdString is : " + holdString;
	}

	public static void main(String[] args) {

		Sequence seq = new Sequence(10);
		for (int i = 0; i < 10; i++) {

			seq.add(new Integer(i).toString());

		}
		Selector sel = seq.selector();
		while(!sel.end()){
			System.out.println(""+sel.current());
			sel.next();
		}
	}
}