package com.myPackage.myClasses;

public class SingleTon implements Cloneable{
	public static SingleTon uniqueInstance;
	int i;
	int j;
	private SingleTon() {
		i =1;
		j=2;
	};
	public static SingleTon getInstance() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new SingleTon();
		}
		return uniqueInstance;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	

}
