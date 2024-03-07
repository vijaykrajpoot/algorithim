package com.threads.runnable;

public class EvenOddNumber implements Runnable {
	private int[] arr;

	public EvenOddNumber(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void run() {
		for (int i : arr) {
			if (i % 2 == 0)
				System.err.println("Even:"+i);
			else
				System.err.println("Odd:"+i);
		}
	}

}
