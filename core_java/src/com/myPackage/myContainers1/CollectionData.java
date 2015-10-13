package com.myPackage.myContainers1;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class CollectionData<E> extends ArrayList<E> {
	
	public CollectionData(Generator<E> gen, int quantity) {
		
		for(int i =0;i<quantity;i++)
			add(gen.next());
	}

	public static <E> CollectionData<E> list(Generator<E> gen, int quantity){
		return new CollectionData<E>(gen, quantity);
	}
}
