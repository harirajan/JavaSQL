package com.myPackage.myTypeInformation;

class Ek {

}

class Do {
	public Do() {

	}
	/*
	 * public Do() {
	 * 
	 * } 
	 */
}

class theen {

}

public class RunTimeInfo {

	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * Ek e = new Ek(); System.out.println(e.getClass());
		 */
		Class c = Class.forName("com.myPackage.myTypeInformation.Do");
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		

	}

}
