package com.threads.waitnotify;

public class Data {

	private String packet;

	boolean transferInProgress = true;

	public synchronized void send(String packet) {

		while (!transferInProgress) {
			try {
				System.out.println("Wait() Start for Sender until transfer is done");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		transferInProgress = false;
		this.packet = packet;
		notifyAll();

	}

	public synchronized String receive() {
		while (transferInProgress) {
			try {
				System.out.println("Wait() Start for recever until transfer is done");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		transferInProgress = true;
		notifyAll();
		return packet;
	}

}
