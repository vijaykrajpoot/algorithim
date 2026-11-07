package com.threads.runnable;
public class EvenOddNumber implements Runnable {
	private int[] arr; // Declares a variable to hold data needed by this method.

	public EvenOddNumber(int[] arr) {
		this.arr = arr;
	}
	@Override
	public void run() {
		for (int i : arr) {
			if (i % 2 == 0)
				System.err.println("Even:"+i);
			else // Runs this branch when the previous conditional check is false.
				System.err.println("Odd:"+i);
		}
	}
}