package com.gs.thread;

public class ThreadTest {
	
	public static void main(String... args) {
		System.out.println("main thread"); // ���߳�
		try {
			Thread.sleep(10 * 1000); // �õ�ǰ�������е��߳�����10s��
		} catch (InterruptedException e) { // �ж��쳣 
			e.printStackTrace();
		}
		System.out.println("main thread");
	}

}
