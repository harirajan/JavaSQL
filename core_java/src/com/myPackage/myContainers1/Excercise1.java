package com.myPackage.myContainers1;

import java.util.ArrayList;
import java.util.List;

public class Excercise1 {

	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<Gerbil>();
		list.add(new Gerbil(1));
		list.add(new Gerbil(2));
		list.add(new Gerbil(3));
		/*for(Gerbil g : list) {
			list.get()
		}*/
		for (int i = 0;i <list.size();i++) {
			list.get(i).hop();
		}
	}
}

class Gerbil{
	
	private int i;
	public Gerbil(int j) {
		this.i = j;
	}
	public void hop() {
		System.out.println("The number is :"+i);
	}
}