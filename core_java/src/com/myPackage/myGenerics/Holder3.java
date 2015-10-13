package com.myPackage.myGenerics;

public class Holder3<T> {
	private T a;

	public void setT(T t) {
		this.a = t;
	}

	public T getT() {
		return a;
	}

	public Holder3(T a) {
		this.a = a;
	}

	public static void main(String[] args) {

		//Holder3 h3 = new Holder3("Hello");
		Holder3<Integer> h3 = new Holder3<Integer>(new Integer(9));
		//h
		System.out.println(h3.getT());
	}
}
