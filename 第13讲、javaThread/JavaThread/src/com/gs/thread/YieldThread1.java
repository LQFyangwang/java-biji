package com.gs.thread;

public class YieldThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Thread.yield(); // 把CPU时间让出来分配给其他的线程，但是此方法不一定就会把cpu时间分配给其他线程（忽略掉）
			System.out.println(Thread.currentThread().getName() + ", " + i);
		}
	}

}
