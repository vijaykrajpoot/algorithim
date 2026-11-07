package com.threads.runnable.executor.callable;
public class EvenOddNumberRunnable implements Runnable {
	private int[] arr; // Declares a variable to hold data needed by this method.

	public EvenOddNumberRunnable(int[] arr) {
		this.arr = arr;
	}
	@Override
	public void run() {
		System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
		for (int i : arr) {
			if (i % 2 == 0)
				System.err.println("Even:"+i);
			else // Runs this branch when the previous conditional check is false.
				System.err.println("Odd:"+i);
		}
	}
}