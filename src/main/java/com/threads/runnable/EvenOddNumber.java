package com.threads.runnable;
// Logic: processes the even odd number problem by transforming the input according to the algorithm and returning the required result.
public class EvenOddNumber

 implements Runnable {
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
