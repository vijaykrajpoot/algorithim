package com.threads.waitnotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
	
	public static void main(String[] args) {
		Data data=new Data();
		
		ExecutorService executorServiceSender=Executors.newFixedThreadPool(2);
		executorServiceSender.submit(new Sender(data));
		
		ExecutorService executorServiceRecever=Executors.newFixedThreadPool(2);
		executorServiceRecever.submit(new Receiver(data));
	}

}
