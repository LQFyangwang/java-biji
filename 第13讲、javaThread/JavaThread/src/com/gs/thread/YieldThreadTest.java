package com.gs.thread;

public class YieldThreadTest {
	
	public static void main(String[] args) {
		YieldThread1 yt1 = new YieldThread1();
		YieldThread2 yt2 = new YieldThread2();
		Thread t1 = new Thread(yt1);
		t1.setName("t1");
		Thread t2 = new Thread(yt2);
		t2.setName("t2");
		t1.start();
		t2.start();
	}

}
