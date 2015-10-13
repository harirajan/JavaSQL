package com.myPackage.myDesignPatterns;

public class GoatAdapter implements Cow {
	Goat goatInstance;

	public GoatAdapter(Goat goat) {
		this.goatInstance = goat;
	}

	public void eatGrass() {
		goatInstance.eatGrass();
		// TODO Auto-generated method stub

	}

	public void cryCow() {
		goatInstance.cryGoat();
		// TODO Auto-generated method stub

	}

}
