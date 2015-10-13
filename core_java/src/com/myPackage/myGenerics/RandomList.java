package com.myPackage.myGenerics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {

	private ArrayList<T> storage = new ArrayList<T>();
	private Random random = new Random(47);

	public void add(T item) {
		storage.add(item);
	}

	public T select() {
		return storage.get(random.nextInt(storage.size()));
	}

	public static void main(String[] args) {

		RandomList<String> randomList = new RandomList<String>();
		randomList.add("Hello");
		randomList.add("How");
		randomList.add("are");
		randomList.add("you");

		System.out.println(randomList.select());
	}
}
