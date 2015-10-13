package com.myJava.myExamples;

public class GenericMethod {

	public static void main(String[] args){
		
		GenericMethod gm = new GenericMethod();
		gm.f("hari");
		gm.f(1);
		gm.f(new Double("3"));
		
	}
	
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}
}
