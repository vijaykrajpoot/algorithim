package com.threads.runnable.executor.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestEvenOddRunnable {
	public static void main(String[] args) {

		EvenOddNumberRunnable evenOddNumberRunnable100 = new EvenOddNumberRunnable(IntStream.range(1, 100).toArray());
		EvenOddNumberRunnable evenOddNumberRunnable200 = new EvenOddNumberRunnable(IntStream.range(100, 200).toArray());
		EvenOddNumberRunnable evenOddNumberRunnable300 = new EvenOddNumberRunnable(IntStream.range(300, 400).toArray());

//		ExecutorService executorService=Executors.newSingleThreadExecutor();
//		executorService.execute(evenOddNumberRunnable);
//		
		
		ExecutorService executorServiceT=Executors.newFixedThreadPool(10);
		executorServiceT.execute(evenOddNumberRunnable100);
		executorServiceT.execute(evenOddNumberRunnable200);
		executorServiceT.execute(evenOddNumberRunnable300);
		executorServiceT.shutdown();
	}
}
