package com.myPackage.myTypeInformation;

interface A {

	public void g();

}

class B implements A {

	public void g() {
		System.out.println("Inside g()");
	}

	public void f() {
		System.out.println("Inside f()");

	}
}

public class InterfaceTypeInfo {

	public static void main(String[] args) {
		A a = new B();
		System.out.println( a instanceof B);
		System.out.println(a.getClass());
		//a.f();
		a.g();
		B b = (B)a;
		b.f();
	}
}
