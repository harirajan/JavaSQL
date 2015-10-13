package com.myPackage.myClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class TestClass {

	public static void main(String[] args) {
		String a = "a";
		// checking equals and == in String >>>>>> START
		String one = "Hari";
		String two = "Hari";
		System.out.println("Checking Equals: " + one.equals(two));
		System.out.println("Checking == : " + one == two);
		// checking equals and == in String >>>>>> END

		// Collection and Iterator >>>> START

		ArrayList<String> newarrayList = new ArrayList<String>();
		newarrayList.add("One");
		newarrayList.add("Two");
		newarrayList.add("Three");
		Iterator newIterator = newarrayList.iterator();
		// System.out.println(//newIterator.);
		
		while (newIterator.hasNext()) {
			System.out.println("Yes");
			newIterator.next();
		}

		Integer newInteger = new Integer("99");
		// newInteger.c
		int i = newInteger;
		System.out.println(i);
		
		Properties p = System.getProperties();
		System.out.println(p);
		
	}

}
