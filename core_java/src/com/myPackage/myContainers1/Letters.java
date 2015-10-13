package com.myPackage.myContainers1;

import java.util.Iterator;

public class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
	private int size = 9;
	private int number = 1;
	private char letter = 'A';

	@Override
	public Pair<Integer, String> next() {
		// TODO Auto-generated method stub
		return new Pair<Integer, String>(number++, "" + letter++);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>(){
			public Integer next() { return number++;}
			public boolean hasNext() {return number<size;}
			public void remove() {throw new UnsupportedOperationException();}
		};
	}
}
