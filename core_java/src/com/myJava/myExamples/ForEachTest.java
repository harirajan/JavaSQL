package com.myJava.myExamples;


public class ForEachTest {
	
	public static void main(String[] args){
	PersonHolder<Person> listHolder = new PersonHolder<Person>();
	listHolder.add(new Person("a",1));
	listHolder.add(new Person("b",2));
	listHolder.add(new Person("c",3));
	listHolder.add(new Person("d",4));
	
	for (Person person :listHolder ) {
		
		System.out.println(person.getName());
		
	}
	}
}
