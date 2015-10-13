package com.myPackage.myContainers1;


class Rodent {
	public void eat() {
		System.out.println("Rodent is Eating");
	}

	public void drink() {
		System.out.println("Rodent is Drinking");
	}

}

class Mouse extends Rodent {
	public void eat() {
		System.out.println("Mouse is Eating");
	}

	public void drink() {
		System.out.println("Mouse is Drinking");
	}

}

class Gerbil2 extends Rodent {
	public void eat() {
		System.out.println("Gerbil2 is Eating");
	}

	public void drink() {
		System.out.println("Gerbil2 is Drinking");
	}

}

class Hamster extends Rodent {
	public void eat() {
		System.out.println("Hamster is Eating");
	}

	public void drink() {
		System.out.println("Hamster is Drinking");
	}

}

public class Excercise9Polymorphism {

	public static void main(String[] args) {
		
		//Rodent[] rodent = new Rodent[] {new Rodent(),new Mouse(), new Hamster()};
		//List<Rodent> list = new ArrayList<Rodent>(){Arrays.asList(new Rodent()));
		
	/*	for(int i=0;i<rodent.length;i++) {
			rodent[i].drink();
			rodent[i].eat();
			
		}*/
		/*for(Rodent r: rodent) {
			
			r.drink();
			r.eat();
		}*/
	}
	
}
