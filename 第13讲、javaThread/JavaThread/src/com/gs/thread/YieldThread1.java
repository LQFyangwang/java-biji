package com.gs.thread;

public class YieldThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Thread.yield(); // ��CPUʱ���ó���������������̣߳����Ǵ˷�����һ���ͻ��cpuʱ�����������̣߳����Ե���
			System.out.println(Thread.currentThread().getName() + ", " + i);
		}
	}

}
