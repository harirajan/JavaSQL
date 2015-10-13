package com.myPackage.myTypeInformation;

class StaticTest {
	/*public StaticTest() {
		System.out.println("Inside the constructor");
	}
*/
	static final String s = "Hari";
}

public class TestOne {

	public static void main(String[] args) throws Exception {
		//StaticTest st = new StaticTest();
		//Class c1 = StaticTest.class;
		System.out.println("One");
		Class c2 =Class.forName("StaticTest");
	}
}
