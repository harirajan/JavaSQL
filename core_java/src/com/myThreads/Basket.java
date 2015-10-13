package com.myThreads;

public class Basket {
	
	boolean available = false;
	int content = 0;

	public synchronized void put(int i ){
		
		if(content == 10){
			try {
				System.out.println("basket full");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			content++;
			System.out.println("put : content now is"+ content);
		 
		//content = i;
		notifyAll();
	}
	
	public synchronized void get(){
		if(content == 0){
			System.out.println("basket empty");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			content--;
			System.out.println("consuemd content now is:" +content);
			//return 1;
			//System.out.println("consumed 1");
		
		notifyAll();
	}
}
