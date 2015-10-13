package com.myPackage.myGenerics;

public class Holder2 {

	private Object a;

	public Holder2(Object a) {

		this.a = a;
	}

	public void setObject(Object a) {

		this.a = a;
	}

	public Object getObject() {

		return a;
	}

	public static void main(String[] args) {
		
		Holder2 h1 = new Holder2(7);
	}
}
