package com.myPackage.myClasses;

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void fly() {
		turkey.fly();
		// TODO Auto-generated method stub

	}

	@Override
	public void quack() {
		turkey.gobble();
		// TODO Auto-generated method stub

	}

}
