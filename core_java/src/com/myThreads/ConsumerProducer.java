package com.myThreads;

public class ConsumerProducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basket b = new Basket();
		Consumer c = new Consumer(b,1);
		Producer p = new Producer(b,1 );
		
		
		
		
		new Thread(c).start();
		new Thread(p).start();
	}

}
