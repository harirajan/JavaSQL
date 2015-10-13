package com.myJava;

public class NewSingleTon {

	public static NewSingleTon singleInstance;
	
	private NewSingleTon() {
		
	}
	
	public static  NewSingleTon getInstance() {
		
		if(singleInstance == null) {
			
			singleInstance = new NewSingleTon();
			
		}
		
		return singleInstance;
	}
}
