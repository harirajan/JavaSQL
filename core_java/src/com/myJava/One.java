package com.myJava;

public class One {

	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	private int b;

	public One(String a, int c) {

		this.a = a;
		this.b = c;
		this.getClass();
	}

/*	public int hashCode() {

		return b * 33 + 100;
	}*/

	public boolean equals(Object o) {

		boolean flag = false;
		One temp = (One) o;

		if (temp.a == a && temp.b == b) {
			flag = true;
			return flag;
		} else
			return flag;

	}

}
