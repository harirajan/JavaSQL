package com.myPackage.coreJavaFunda;

 class ArrayAlg{
	
	public static <T> T getMiddle(T[] a){
		
		return a[a.length/2];
	}
}
public class FirstClass {

	public static void main(String[] args) {
		
		String str[] = {"one","two","three"};
		String str1 = ArrayAlg.getMiddle(str);
		System.out.println(str1);
		
	}
}
