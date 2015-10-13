package com.myJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializationBox implements Serializable {
	static SerializationBox singleton = new SerializationBox();

	private SerializationBox() {
	}

	/*
	 * protected Object readResolve() { return singleton; }
	 */

}

public class SerializationSample {

	public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException {

		SerializationBox serialB = SerializationBox.singleton;
		serialize("serial.out", serialB);
		System.out.println(serialB.hashCode());
		SerializationBox sb = (SerializationBox) deSerialize("serial.out");
		// System.out.println(sb.getSerializableProp());
		System.out.println(sb.hashCode());
	}

	public static void serialize(String outFile, Object serializableObject) throws IOException {
		FileOutputStream fos = new FileOutputStream(outFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializableObject);
	}

	public static Object deSerialize(String serilizedObject) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(serilizedObject);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return ois.readObject();
	}
}
