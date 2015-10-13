package com.myPackage.myClasses;


/**
 * @author Hari
 *
 */
public class TestForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (String string : args) {
			
			//myPrintMethod(string);
			myPrintMethod(0);
			myPrintMethod(0,"hari","sree");
		}
	}
	
	/**
	 * @param obj
	 */
	static void myPrintMethod(int i, Object... obj) {
		
		System.out.println(i);
		for(Object obj1 : obj){
		System.out.println(obj1.toString());
		}
	}
}
