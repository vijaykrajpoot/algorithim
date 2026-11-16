package com.threads.runnable.executor.callable;
// Logic: processes the even odd number runnable problem by transforming the input according to the algorithm and returning the required result.
public class EvenOddNumberRunnable

 implements Runnable {
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
