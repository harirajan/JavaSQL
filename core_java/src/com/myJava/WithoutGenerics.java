package com.myJava;

import java.util.ArrayList;

public class WithoutGenerics {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		
		ArrayList<Apple> apples = new ArrayList<Apple>();
		
		//apples.add("apple 1");
		for (int i = 0;i < 3 ; i ++){
			
			apples.add(new Apple());
		}
		
		for (  Apple a : apples) {
			
			System.out.println(a.id());
		}
		
		//apples.add(new Orange());
		/*for(int j = 0; j < 4; j ++){
			
			apples.get(j);
		}*/
	}

}

class Orange{
	
	
}
class Apple{
	
	private static long counter ;
	private final long id = counter++;
	public long id(){
		
		return id ;
	}
	
}