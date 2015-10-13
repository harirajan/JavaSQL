package com.myPackage.myGenerics;

public class CountedObject {
	
	public static long counter=0;
	private long id = counter++;
	public long id() {return id;}
	public String toString() {
		
		return "id is"+id;
		
	}

}
