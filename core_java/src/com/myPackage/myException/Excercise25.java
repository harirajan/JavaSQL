package com.myPackage.myException;

class ExceptionA extends Exception {
}

class ExceptionB extends ExceptionA {
}

class ExceptionC extends ExceptionB {
}

class A {

	public void methodABC() throws ExceptionA {

		throw new ExceptionA();

	}
}

class B extends A {

	public void methodABC() throws ExceptionB {

		throw new ExceptionB();

	}
}

class C extends B{

	public void methodABC() throws ExceptionC {

		throw new ExceptionC();

	}
}

public class Excercise25 {
	
	public static void main(String[] args) throws ExceptionA {
		
		C c = new C();
		A a = (A)c;
		a.methodABC();
	}

}
