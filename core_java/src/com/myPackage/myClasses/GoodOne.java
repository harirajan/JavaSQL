package com.myPackage.myClasses;

public class GoodOne {

	public static void myMethod(int i){
		
		String[] s = {"true","false"};
		System.out.println(s[i]);
	}
	
	public static void main(String[] args){
		
		//GoodOne.myMethod(Integer.valueOf(args[0]));
		GoodOne.myMethod(0);
	}
}
