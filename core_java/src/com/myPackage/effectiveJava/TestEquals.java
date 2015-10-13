package com.myPackage.effectiveJava;

import java.util.concurrent.atomic.AtomicInteger;

public class TestEquals {

	public static void main(String[] args) {

		/*
		 * CaseInsensitiveString ciS = new CaseInsensitiveString("Test"); String
		 * s = "Test"; System.out.println(ciS.equals(s));
		 * System.out.println(s.equals(ciS));
		 */
		/*
		 * Point x = new Point(2, 3); Point y = x;
		 * System.out.println("point equals: " + x.equals(y));
		 * System.out.println("point == :" + (x == y));
		 * 
		 * System.out.println("==============================="); String s1 =
		 * new String("Hari"); String s2 = new String("Hari");
		 * System.out.println(s1.equals(s2)); System.out.println(s1 == s2);
		 */
		Point x = new Point(1, 3);
		Point y = x;
		//System.out.println(x == y);
		ColorPoint cP = new ColorPoint(1, 3, 4);
		ColorPoint cP1 = new ColorPoint(1, 3, 5);
		System.out.println(x.equals(cP));
		//System.out.println(cP.equals(x));
		System.out.println(cP.equals(cP1));
		
	//	pri
		AtomicInteger counter =new AtomicInteger();
		//counter.g
	 
		
		
		
	}
}
