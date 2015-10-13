package com.myPackage.myContainers1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Excercise8 {

	public static void main(String[] args) {
		List<Gerbil1> list = new ArrayList<Gerbil1>();
		list.add(new Gerbil1(1));
		list.add(new Gerbil1(2));
		list.add(new Gerbil1(3));
		/*for(Gerbil g : list) {
			list.get()
		}*/
		/*for (int i = 0;i <list.size();i++) {
			list.get(i).hop();
		}*/
		//Using Iterator
		Iterator<Gerbil1> iter = list.iterator();
		while(iter.hasNext()) {
			(iter.next()).hop();
		}
	}
}

class Gerbil1{
	
	private int i;
	public Gerbil1(int j) {
		this.i = j;
	}
	public void hop() {
		System.out.println("The number is :"+i);
	}
}