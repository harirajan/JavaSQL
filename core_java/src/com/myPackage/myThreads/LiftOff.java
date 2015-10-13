package com.myPackage.myThreads;

public class LiftOff implements Runnable {

	protected int countdown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {
	}

	public LiftOff(int i) {
		this.countdown = i;
	}

	public String status() {

		return "#" + id + " - " + (countdown > 0 ? countdown : "LiftOff!");
	}

	public void run() {
		while (countdown-- > 0) {
			System.out.println(status());

		}
		// TODO Auto-generated method stub
		// Thread.yield();

	}

}
