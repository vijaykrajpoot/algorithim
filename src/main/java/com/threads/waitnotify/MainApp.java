package com.threads.waitnotify;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// Logic: processes the main app problem by transforming the input according to the algorithm and returning the required result.
public class MainApp {

	public static void main(String[] args) {
		Data data=new Data();
		ExecutorService executorServiceSender=Executors.newFixedThreadPool(2);
		executorServiceSender.submit(new Sender(data));
		ExecutorService executorServiceRecever=Executors.newFixedThreadPool(2);
		executorServiceRecever.submit(new Receiver(data));
	}
}
