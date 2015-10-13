package com.myPackage.myExcercises;

public class Excercise1Thread implements Runnable {
	private static long count=0;
	public long id =count++;
	
	public Excercise1Thread(){
		System.out.println("Starting up");
	}
	public Excercise1Thread(String name) {
		System.out.println("Starting UP --"+name);
	}
	
	public void run() {
		for(int j= 0;j<=3;j++) {
			System.out.println(printMessage(j));
		Thread.yield();
		}
		
	}
	
	public String printMessage(int i) {
		
		return "#" + id + "(" + (i <3 ? "its the "+i+"th thread" : "Shutting Down! "+id+" th Thread") + "), "; 
		
	}

}
