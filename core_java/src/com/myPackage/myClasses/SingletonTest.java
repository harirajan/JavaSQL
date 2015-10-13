package com.myPackage.myClasses;


public class SingletonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		SingleTon st = SingleTon.getInstance();
		SingleTon st1 = (SingleTon)st.clone();
		System.out.println(st.equals(st1));
		System.out.println(st == st1);
		
	}
}
