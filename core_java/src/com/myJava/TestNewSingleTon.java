package com.myJava;



public class TestNewSingleTon {
	
	public static void main(String[] args) {
		
		NewSingleTon newSingleTon1 = NewSingleTon.getInstance();
		NewSingleTon newsingleTon2 = NewSingleTon.getInstance();
		
		System.out.println(newsingleTon2 == newSingleTon1);
		System.out.println(newSingleTon1.equals(newsingleTon2));
	}

}
