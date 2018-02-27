package com.gs.thread;

public class CDEThread extends Thread {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("cde, " + Thread.currentThread().getName());
    			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
