package com.myJava.myStudy;


public class Person implements Comparable<Person>{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private int age;
	private String name;

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

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person p1) {
		
		if(p1.age > age)
			return 1;
		if(p1.age < age)
			return -1;
		else
			return 0;
		// TODO Auto-generated method stub
		//return 0;
	}

	/*public int compare(Person p1, Person p2) {
		
		if (p1.age < p2.age)
			return -1;
		else if(p1.age == p2.age)
			return 0;
		else return 1;
				// TODO Auto-generated method stub
		//return 0;
	}*/
}
