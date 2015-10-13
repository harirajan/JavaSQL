package com.myJava.myExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonHolder<T> implements Iterable<T> {
	int size;
	int index;
	List<T> list = new ArrayList<T>();

	public void add(T t) {
		// list.
		list.add(t);
		size++;
	}

	
	// public T next(){ return list.get(index++); }
	

	
	public Iterator<T> iterator() {

		return new PersonHolderIterator();
	}

	//@SuppressWarnings("hiding")
	class PersonHolderIterator implements Iterator<T> {
		int count = size;

		public boolean hasNext() {
			return count > 0;

		}

		public T next() {
			count--;

			return  list.get(index++);

		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		
		
	}

}
