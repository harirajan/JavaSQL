package com.myJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Person p1 = new Person("Hari", 3);
		Singleton singleTon = (Singleton) deserialize("C:/Users/Hari/Desktop/tet.txt");

		System.out.println(singleTon.hashCode());

	}

	public static Object deserialize(String str) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(str);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return ois.readObject();

	}
}
