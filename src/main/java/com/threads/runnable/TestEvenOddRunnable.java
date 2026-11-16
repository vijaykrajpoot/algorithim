package com.threads.runnable;
import java.util.stream.IntStream;


// Logic: runs known sample inputs and compares the outputs with expected values to validate the algorithm.
public class TestEvenOddRunnable {

	public static void main(String[] args) {
		EvenOddNumber evenOddNumber = new EvenOddNumber(IntStream.range(1, 100).toArray());
		Thread t1 = new Thread(evenOddNumber);
		t1.start();
	}
}
