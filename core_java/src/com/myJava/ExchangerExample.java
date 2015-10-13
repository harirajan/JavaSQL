package com.myJava;

import java.util.concurrent.Exchanger;

public class ExchangerExample {

	Exchanger exchanger = new Exchanger();

	private class Producer implements Runnable {

		private String queue;

		public void run() {
			try {
				queue = (String) exchanger.exchange("Ready Queue");
				System.out.println(Thread.currentThread().getName() + "now has " + queue);
			} catch (InterruptedException iE) {
				iE.printStackTrace();
			}

		}
	}

	private class Consumer implements Runnable {

		private String queue;

		public void run() {
			try {
				queue = (String) exchanger.exchange("Empty Queue");
				System.out.println(Thread.currentThread().getName() + "now has" + queue);
			} catch (InterruptedException iE) {
				iE.printStackTrace();
			}
		}
	}
	
	private void start() {
		
		new Thread(new Producer(), "producer").start();
		new Thread(new Consumer(), "consumer").start();
	}
	
	public static void main(String[] args) {
		
		new ExchangerExample().start();
	}
}
