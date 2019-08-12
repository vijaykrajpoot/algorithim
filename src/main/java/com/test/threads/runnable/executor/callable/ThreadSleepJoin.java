package com.test.threads.runnable.executor.callable;

import java.time.LocalTime;
import java.util.stream.IntStream;

public class ThreadSleepJoin implements Runnable {

	Object lock = new Object();

	@Override
	public void run() {
		// IntStream.range(0, 1000).forEach(n -> {
		//
		// System.out.println(Thread.currentThread().getName() + "  " + n +
		// ": LocalTime.now():" + LocalTime.now());
		// try {
		// Thread.sleep(4000);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// });
		System.out.println("Entered:" + Thread.currentThread().getName() + " : LocalTime.now():" + LocalTime.now());
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting:" + Thread.currentThread().getName() + ": LocalTime.now():" + LocalTime.now());
	}

	public static void main(String[] args) {
		System.out.println("Entered:" + Thread.currentThread().getName() + " : LocalTime.now():" + LocalTime.now());
		ThreadSleepJoin threadSleepJoin = new ThreadSleepJoin();
		Thread t1 = new Thread(threadSleepJoin, "T1");
		Thread t2 = new Thread(threadSleepJoin, "T2");
		t1.start();
		t2.start();
		// start second thread after waiting for 2 seconds or if it's dead
		try {
			t2.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Exiting:" + Thread.currentThread().getName() + " : LocalTime.now():" + LocalTime.now());
		System.err.println(" T1 is Alive:" + t1.isAlive());
		System.err.println(" T2 is Alive:" + t2.isAlive());

	}

}
