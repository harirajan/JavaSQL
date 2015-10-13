package com.myPackage.myThreads;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {
	private final int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	public String call() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException ie) {

		}
		return "result of TaskWithResult " + id;
	}
}

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++)
			results.add(exec.submit(new TaskWithResult(i)));
		for (Future<String> fs : results)
			try {
				// get() blocks until completion:
				System.out.println(fs.isDone());
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				System.out.println(e);
			} finally {
				exec.shutdown();
			}
	}
}
