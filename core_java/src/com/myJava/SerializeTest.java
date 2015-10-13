package com.myJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) throws IOException {

		Singleton singleTon = Singleton.getInstance();
		// Person p1 = new Person("Hari", 3);
		System.out.println(singleTon.hashCode());
		serialize(singleTon);

	}

	public static void serialize(Object o) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:/Users/Hari/Desktop/tet.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o);

	}
}
