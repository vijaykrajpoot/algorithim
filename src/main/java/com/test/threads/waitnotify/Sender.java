package com.test.threads.waitnotify;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
	private Data data;
	
	public Sender(Data data) {
		this.data=data;
	}
	
	@Override
	public void run() {
		System.err.println("Sender==>Thread.currentThread().getName():"+Thread.currentThread().getName());
		String packets []={
				"1","2","3","4","5","6","7","8",";"
		};
		for(String packet:packets){
			System.err.println("Sending: Packet:"+packet);
			data.send(packet);
			try {
				 Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt(); 
                System.err.println("Thread interrupted"+e.getMessage()); 
			}
		}
	}

}
