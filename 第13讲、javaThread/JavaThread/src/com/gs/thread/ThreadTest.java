package com.gs.thread;

public class ThreadTest {
	
	public static void main(String... args) {
		System.out.println("main thread"); // 主线程
		try {
			Thread.sleep(10 * 1000); // 让当前正在运行的线程休眠10s钟
		} catch (InterruptedException e) { // 中断异常 
			e.printStackTrace();
		}
		System.out.println("main thread");
	}

}
