package com.gs.thread;

import org.junit.Test;

public class ABCDEThreadTest {
	
	public static void main(String[] args) {
		ABCThread t1 = new ABCThread();
		CDEThread t2 = new CDEThread();
		t1.setName("abcThread");
		t1.start(); // 启动了两个线程，则此两个线程与主线程随机获取cpu时间来执行
		t2.setName("cdeThread");
		t2.start();
		// t1.stop(); // 不能使用stop方法来停止线程的执行
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.setNeedRun(false);
	}
	
	@Test
	public void testRunnable() {
		ABCThread1 abcThread = new ABCThread1();
		Thread t1 = new Thread(abcThread);
		CDEThread1 cdeThread = new CDEThread1();
		cdeThread.setTotalCount(5);
		Thread t2 = new Thread(cdeThread);
		t1.start();
		t2.start();
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		abcThread.setNeedRun(false);
	}

}
