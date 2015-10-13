package com.myPackage.myExcercises;

public class OrderOfExecution extends Two{

	private Two two = new Two();
	private One one = new One();

	public static void main(String[] args) {
		
		System.out.println("Inside main()");
		new OrderOfExecution();
	}
}
