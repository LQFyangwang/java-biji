package com.gs.thread;

public class PriorityThreadTest {
	
	public static void main(String[] args) {
		PriorityThread1 pt1 = new PriorityThread1();
		PriorityThread2 pt2 = new PriorityThread2();
		Thread t1 = new Thread(pt1);
		// 设置优先级，优先级用int来表示，Thread.MIN_PRIORITY  1    THREAD.MAX_PRIORITY  10
		// 设置的优先级越高，则越容易被执行
		// 10个级别的优先级，如果没有设置优先级，默认为Thread.NORM_PRIORITY   5   
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread t2 = new Thread(pt2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
