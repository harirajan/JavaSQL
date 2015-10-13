package com.myJava.myStudy;

public class RTTIDemo {
	public static class A {
	}

	public static class B extends A {
	}

	public static class C {
	}

	public final static void castingWithRTTI() {
		A a = null;
		A a1 = new A();
		B b = new B();
		C c = new C();
		a = (A) b; // no problem
		b = (B) a; // still no problem, casting back to what it was created as.
		a = a1; // Same type so no problem
		Object d = (Object) c; // no problem because of implicit inheritance
		c = (C) d; // casting back
		//b = (A) a1; // compiler error: a1 is not a B.
//		/b = (B) c; // compiler error: c is not a B.
	}
}
