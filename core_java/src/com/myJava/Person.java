package com.myJava;

public class Person implements Comparable<Person>{

	public String firstName;
	public String lastName;
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int age;
	public Person(String firstname, String lastname, String middlename) {

		this.firstName = firstname;
		this.lastName = lastname;
		this.name = middlename;
	}
	public Person(String firstname, int age) {
		
	}
	public boolean equals(Object o) {
		return o instanceof Person && ((Person) o).firstName == firstName && ((Person) o).lastName == lastName && ((Person) o).name == name;
	}

	public int hashCode() {

		return this.firstName.length() * 32 + this.lastName.length() * 32 + this.name.length() * 32;

		// return this.firstName * 44;
	}

	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(arg0.firstName);
	}
}
