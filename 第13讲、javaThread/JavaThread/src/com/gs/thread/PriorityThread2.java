package com.gs.thread;

public class PriorityThread2 implements Runnable {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("PriorityThread2");
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
