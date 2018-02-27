package com.gs.thread;

public class ThreadSleepTest implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) { // �������ߵ��̣߳������interrupt�������ѣ�����ƸInterruptedException
			System.out.println(Thread.currentThread().getName() + "������");
		}
		System.out.println("thread sleep");
	}
	
	public static void main(String[] args) {
		ThreadSleepTest tst = new ThreadSleepTest();
		Thread t = new Thread(tst);
		t.setName("sleepthread");
		t.start();
		t.interrupt(); // ����һ���������ߵ��߳�
	}
	

}
