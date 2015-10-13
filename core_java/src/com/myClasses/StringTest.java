package com.myClasses;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str = new String("abc");
		String str1 = "abc";
		System.out.println(str == str1);
		*/
		String s3= new String("abc");
		s3 = s3.intern();
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println("s1 == s2 ? "+(s1==s2)); //true
		System.out.println("s1 == s3 ? "+(s1==s3)); //false
		System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true
	}

}
