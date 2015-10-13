package com.myJava;

public class HashTest {

	public static void main(String[] args) {

		// Hashtable<String, String> hTable = new Hashtable<String, String>();
		// // hTable.put(null, "a");
		// hTable.put("a", null);
		// System.out.println(hTable.toString());
		// HashMap<String, String> hMap = new HashMap<String, String>();
		// hMap.put(null, "b");
		// hMap.put("c", null);
		// System.out.println(hMap.toString());

		Person p1 = new Person("One", 1);
		System.out.println(p1);
		Student student1 = new Student(1, "One");
		Student student2 = new Student(1, "One");
		System.out.println(student1.equals(student2));
	}
}

class Student {

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	@Override
	public int hashCode() {

		return age * 32 + name.hashCode();

	}

	@Override
	public boolean equals(Object o) {

		return o instanceof Student && ((Student) o).name == this.name && ((Student) o).age == this.age;

	}

}
