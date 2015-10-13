package com.myPackage.myInnerClasses;

public class Excercise7 {

	private int i;
	
	public Excercise7(int k){
		System.out.println("Setting the private variable");
		this.i =k;
	}
	private void firstMethod() {
		System.out.println("In the method()");
	}
	
	public void secondMethod() {
		
		new Excercise7(8).new InnerExcercise7().modify(9);
		
	}

	public class InnerExcercise7 {

		public void modify(int j) {
			System.out.println("modifying the variable");

			i = j;

			Excercise7.this.firstMethod();
		}
	}
	
	public static void main(String[] args) {
		
		Excercise7 e7 = new Excercise7(9);
		e7.secondMethod();
	}

}
