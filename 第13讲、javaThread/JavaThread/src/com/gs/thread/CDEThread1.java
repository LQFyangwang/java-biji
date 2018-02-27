package com.gs.thread;

public class CDEThread1 implements Runnable {
	
	private int totalCount = 100;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public void run() {
		for (int i = 0; i < totalCount; i++) {
			System.out.println("cde, " + Thread.currentThread().getName());
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
