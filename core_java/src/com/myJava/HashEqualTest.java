package com.myJava;

public class HashEqualTest {

	public static void main(String[] args) {
		
		Address add1 = new Address("a",19999);
		Address add2 = new Address("a", 19999);
		System.out.println(add1.equals(add2));
	}
}
