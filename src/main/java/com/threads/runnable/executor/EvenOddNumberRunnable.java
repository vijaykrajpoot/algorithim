package com.threads.runnable.executor;
import java.util.concurrent.Callable;
public class EvenOddNumberRunnable implements Callable<String> {
	private int[] arr; // Declares a variable to hold data needed by this method.

	public EvenOddNumberRunnable(int[] arr) {
		this.arr = arr;
	}
	@Override
	public String call() throws Exception {
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
		for (int i : arr) {
			if (i % 2 == 0)
				System.err.println("Even:" + i);
			else // Runs this branch when the previous conditional check is false.
				System.err.println("Odd:" + i);
		}
		return "Done";
	}
}