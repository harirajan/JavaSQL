package com.myJava;

public class StudyJava {

	public static void main(String[] args) {
		
		System.out.println("Test Java");
		//Date d = new Date();
		String str ="myString";
		Object obj = str;
		Object strObj = "myObjectString";
		str = (String)strObj;
		Double num;
		num =(Double)strObj;
	}
}

class OneJava{
	
	int globalint;
	
	final String finalString ="a";
	
	public void itsaFunction() {
		
		int localint = 0;
		System.out.println(localint);
		System.out.println(globalint);
		
	}
}
