package com.test.threads.runnable.executor;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class TestEvenOddRunnable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		EvenOddNumberRunnable evenOddNumberRunnable100 = new EvenOddNumberRunnable(IntStream.range(1, 100).toArray());
		EvenOddNumberRunnable evenOddNumberRunnable200 = new EvenOddNumberRunnable(IntStream.range(100, 200).toArray());
		EvenOddNumberRunnable evenOddNumberRunnable300 = new EvenOddNumberRunnable(IntStream.range(200, 300).toArray());
		EvenOddNumberRunnable evenOddNumberRunnable400 = new EvenOddNumberRunnable(IntStream.range(300, 400).toArray());

		// ExecutorService executorService=Executors.newSingleThreadExecutor();
		// executorService.execute(evenOddNumberRunnable);
		//

		ExecutorService executorServiceT = Executors.newFixedThreadPool(10);
		Future<String> future1 = executorServiceT.submit(evenOddNumberRunnable100);
		System.out.println(LocalTime.now() + "::" + future1.get());

		Future<String> future2 = executorServiceT.submit(evenOddNumberRunnable200);
		System.out.println(LocalTime.now() + "::" + future2.get());

		Future<String> future3 = executorServiceT.submit(evenOddNumberRunnable300);
		System.out.println(LocalTime.now() + "::" + future3.get());

		Future<String> future4 = executorServiceT.submit(evenOddNumberRunnable400);
		System.out.println(LocalTime.now() + "::" + future4.get());

		// System.out.println( LocalTime.now()+"::"+future1.get());
		// System.out.println( LocalTime.now()+"::"+future2.get());
		// System.out.println( LocalTime.now()+"::"+future3.get());
		// System.out.println( LocalTime.now()+"::"+future4.get());

		executorServiceT.shutdown();
	}
}
