package com.test.threads.runnable.executor.callable;

public class EvenOddNumberRunnable implements Runnable {
	private int[] arr;

	public EvenOddNumberRunnable(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void run() {
		System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
		for (int i : arr) {
			if (i % 2 == 0)
				System.err.println("Even:"+i);
			else
				System.err.println("Odd:"+i);
		}
	}

}
