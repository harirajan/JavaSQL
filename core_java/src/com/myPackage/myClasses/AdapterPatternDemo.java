package com.myPackage.myClasses;

import java.util.ArrayList;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		ArrayList<Duck> al = new ArrayList<Duck>();
		al.add(new MallardDuck());
		al.add(new TurkeyAdapter(new WildTurkey()));
		//al.add(new Turkey());

	}

}
