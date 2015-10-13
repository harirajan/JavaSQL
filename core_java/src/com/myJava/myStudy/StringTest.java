package com.myJava.myStudy;

public class StringTest {
	public static void main(String[] args) {
		/*String s = "just a string";
		s = s + "add me too";
		System.out.println(s);*/
		
		  StringBuffer s = new StringBuffer("just a string") ; 
		  //StringBuilder s = new StringBuilder("just a string"); 
		  s = s.append("add me too");
		  System.out.println(s);
		 
	}
}