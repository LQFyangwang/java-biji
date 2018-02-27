package com.gs.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(5 * 1000); // 一旦进入run方法，则意味着当前正在跑的线程是自定义的线程类，如果进入休眠，则另外的线程需要获取cpu时间
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("mythread"); // 一旦run方法执行完毕，整个程序回到主线程继续执行
	}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5 * 1000); // 让当前正在运行的主线程休眠5s
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyThread myThread = new MyThread(); // 创建自定义线程类的对象
		myThread.start(); // 启动线程，线程启动后自动运行线程类的run方法
		System.out.println("main thread");
	}
	
}
