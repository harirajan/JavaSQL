package com.myPackage.myDesignPatterns;

public class TestAdapterPattern {

	public static void main(String[] args) {
		NewCow nc = new NewCow();
		NewGoat ng = new NewGoat();
		Cow goatAdatper = new GoatAdapter(ng);
		System.out.println("The cow says....");
		nc.eatGrass();
		nc.cryCow();
		System.out.println("The goat says....");
		ng.eatGrass();
		ng.cryGoat();
		System.out.println("The adapter says");
		testCow(goatAdatper);

	}

	static void testCow(Cow cow) {
		cow.eatGrass();
		cow.cryCow();
	}
}
