package com.myJava.myExamples;

public class Person {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String name;
	private long id;
	
	public Person(String name, long id){
		this.name = name;
		this.id = id;
	}

}
