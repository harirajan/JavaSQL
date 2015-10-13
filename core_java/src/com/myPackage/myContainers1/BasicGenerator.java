package com.myPackage.myContainers1;


public class BasicGenerator<T> implements Generator<T> {
	Class<T> type;
	@Override
	public T next() {
		// TODO Auto-generated method stub
		try {
		return type.newInstance();}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		//return null;
	}
	
	public BasicGenerator(Class<T> type) {
		
		this.type = type;
	}

}
