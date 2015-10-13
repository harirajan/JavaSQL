package com.myPackage.myGenerics;

import com.myPackage.myInterface.Generator;

public class BasicGenerator<T> implements Generator<T> {
	Class<T> type;

	public BasicGenerator(Class<T> type) {
		this.type = type;
	}

	public T next() {
		try {
		return type.newInstance();
		}catch(Exception e) {
			throw new RuntimeException();
		}

	}

	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
}
