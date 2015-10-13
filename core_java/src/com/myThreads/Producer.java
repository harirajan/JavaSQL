package com.myThreads;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

	Basket basket;
	
	public Producer (Basket b, int number ){
		this.basket = b;
	}
	public void run(){
		 for(int i = 0; i <10 ;i++){
			 basket.put(i);
//			 /System.out.println("put one into basket : " + i);
			 try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
}
