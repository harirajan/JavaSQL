package com.myPackage.headFirst.myThreads;

class BankAccount {
	private int balance = 200;

	public int getBalance() {

		return this.balance;
	}

	public void withdraw(int amount) {

		this.balance = this.balance - amount;
		System.out.println("The balance is :"+this.balance);
	}

}

public class RyanandMonicaJob implements Runnable {
	BankAccount ba = new BankAccount();

	public static void main(String[] args) {
		RyanandMonicaJob rmj = new RyanandMonicaJob();
		Thread ryan = new Thread(rmj);
		ryan.setName("Ryan");
		Thread monica = new Thread(rmj);
		monica.setName("Monica");
		monica.start();
		ryan.start();

	}

	public void run() {
		System.out.println("This thread is : "+Thread.currentThread().getName());
		for (int i = 0; i < 4; i++) {
			synchronized (ba) {
			if (ba.getBalance() > 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ie) {
					// System.out.println("the stacktrace is : "+ie.printStackTrace());
					ie.printStackTrace();
				}
				
					ba.withdraw(50);
				} else {
					System.out.println("Account is overdrawn");
					return;
				}
				
			}
			
		}

	}

}
