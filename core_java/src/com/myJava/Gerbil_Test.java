package com.myJava;

import java.util.ArrayList;

class Gerbil {

	int gerbilNumber = 1;
	static int tempCounter = 1;
	public Gerbil(){
		
		this.gerbilNumber= tempCounter++; 
	}
	
	public void hop(){
		
		System.out.println(gerbilNumber);
		
			
	}
}

public class Gerbil_Test{
	
	public static void main(String[] args){
		
		ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();
		
		for (int j = 0; j < 10; j ++)
		gerbil.add(new Gerbil());
		
		for (Gerbil gerbil2 : gerbil) {
			
			gerbil2.hop();
		}
	}
}
