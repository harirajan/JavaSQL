package com.myJava.myExamples;

public class MethodParameterPassing {
	private String name = "hari";
	public static void main(String[] args) {
		MethodParameterPassing mpP = new MethodParameterPassing();
		mpP.change(mpP);
		System.out.println(mpP.name);
	}

	public <T> void change(MethodParameterPassing a){
		
		a.name ="Hari";
		
	}
}
