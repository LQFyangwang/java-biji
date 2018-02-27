package com.gs.thread;

import org.junit.Test;

public class ABCDEThreadTest {
	
	public static void main(String[] args) {
		ABCThread t1 = new ABCThread();
		CDEThread t2 = new CDEThread();
		t1.setName("abcThread");
		t1.start(); // �����������̣߳���������߳������߳������ȡcpuʱ����ִ��
		t2.setName("cdeThread");
		t2.start();
		// t1.stop(); // ����ʹ��stop������ֹͣ�̵߳�ִ��
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
