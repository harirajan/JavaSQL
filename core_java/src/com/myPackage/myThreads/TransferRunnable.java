package com.myPackage.myThreads;

/**
 * A runnable that transfers money from an account to other accounts in a bank.
 * 
 * @version 1.30 2004-08-01
 * @author Cay Horstmann
 */
public class TransferRunnable implements Runnable {
	/**
	 * Constructs a transfer runnable.
	 * 
	 * @param b
	 *            the bank between whose account money is transferred
	 * @param from
	 *            the account to transfer money from
	 * @param max
	 *            the maximum amount of money in each transfer
	 */
	public TransferRunnable(Bank b, int from, double max) {
		bank = b;
		fromAccount = from;
		maxAmount = max;
	}

	public void run() {
		try {
			while (true) {
				int toAccount = (int) (bank.size() * Math.random());
				double amount = maxAmount * Math.random();
				bank.transfer(fromAccount, toAccount, amount);
				Thread.sleep((int) (DELAY * Math.random()));
			}
		} catch (InterruptedException e) {
		}
	}

	private final Bank bank;
	private final int fromAccount;
	private final double maxAmount;
	private final int DELAY = 10;
}
