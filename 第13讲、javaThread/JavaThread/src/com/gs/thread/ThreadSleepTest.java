package com.gs.thread;

public class ThreadSleepTest implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) { // 正在休眠的线程，如果被interrupt方法唤醒，则招聘InterruptedException
			System.out.println(Thread.currentThread().getName() + "被唤醒");
		}
		System.out.println("thread sleep");
	}
	
	public static void main(String[] args) {
		ThreadSleepTest tst = new ThreadSleepTest();
		Thread t = new Thread(tst);
		t.setName("sleepthread");
		t.start();
		t.interrupt(); // 唤醒一个正在休眠的线程
	}
	

}
