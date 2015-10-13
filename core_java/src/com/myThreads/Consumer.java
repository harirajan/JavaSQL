package com.myThreads;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

	Basket basket;
	
	
	public Consumer (Basket b, int number ){
		this.basket = b;
	}
	public void run(){
		
		for(int i =0;i<10;i++){
			
			basket.get();
//			/System.out.println("consumed one : "+ i);
			try{
				TimeUnit.MILLISECONDS.sleep(100);
			} catch(InterruptedException e){
				
			}
		}
	}
	
}
