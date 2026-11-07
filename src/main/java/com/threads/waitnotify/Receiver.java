package com.threads.waitnotify;
import java.util.concurrent.ThreadLocalRandom;
public class Receiver implements Runnable {
	private Data data; // Declares a variable to hold data needed by this method.

	public Receiver(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		System.err.println("Receiver Start:==>Thread.currentThread().getName():" + Thread.currentThread().getName());
		for (String packet = data.receive(); !packet.equals(";"); packet = data.receive()) {
			System.out.println("Received:" + packet);
			try { // Attempts the guarded logic and prepares for possible failure.
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Thread interrupted" + e.getMessage());
			}
		}
		System.err.println("Receiver Exiting:==>Thread.currentThread().getName():" + Thread.currentThread().getName());
	}
}