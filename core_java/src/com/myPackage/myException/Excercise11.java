package com.myPackage.myException;


class TheException extends Exception{}
public class Excercise11 {
	
	
	
	public void f(){
		try {
			g();
		} catch (TheException ne) {
			System.out.println("Caught TheException: " + ne.getMessage());
			throw new RuntimeException(ne);
		}
	}

	public static void g() throws TheException {
		
		throw new TheException();
	}
	
	public static void main(String[] args) {
		
		Excercise11 e11 = new Excercise11();
		e11.f();
	}
}
