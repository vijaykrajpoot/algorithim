package com.threads.runnable.executor;

import java.util.concurrent.Callable;

public class EvenOddNumberRunnable implements Callable<String> {
	private int[] arr;

	public EvenOddNumberRunnable(int[] arr) {
		this.arr = arr;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
		for (int i : arr) {
			if (i % 2 == 0)
				System.err.println("Even:" + i);
			else
				System.err.println("Odd:" + i);
		}
		return "Done";
	}

}
