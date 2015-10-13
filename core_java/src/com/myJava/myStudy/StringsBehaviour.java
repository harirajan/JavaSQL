package com.myJava.myStudy;

public class StringsBehaviour {

	public static void main(String[] args) {

		/*
		 * String str1 = "hari"; String str2 = new String("hari");
		 * 
		 * System.out.println(str1.equals(str2)); System.out.println(str1 ==
		 * str2);
		 */

		 StringBuffer buf = new StringBuffer();
		 buf.append("one" + "two");
		 String one = "str1";
		 StringBuffer buf1 = new StringBuffer();
		 buf1.append(one + "two");

		// String one = "str1";
		// StringBuffer buf = new StringBuffer();
		// buf.append(one);
		// buf.append("two");

//		final String one = "str1";
//		StringBuffer buf = new StringBuffer();
//		buf.append(one + "two");
	}

}
