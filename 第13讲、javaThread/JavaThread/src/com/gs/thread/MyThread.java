package com.gs.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(5 * 1000); // һ������run����������ζ�ŵ�ǰ�����ܵ��߳����Զ�����߳��࣬����������ߣ���������߳���Ҫ��ȡcpuʱ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("mythread"); // һ��run����ִ����ϣ���������ص����̼߳���ִ��
	}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5 * 1000); // �õ�ǰ�������е����߳�����5s
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyThread myThread = new MyThread(); // �����Զ����߳���Ķ���
		myThread.start(); // �����̣߳��߳��������Զ������߳����run����
		System.out.println("main thread");
	}
	
}
