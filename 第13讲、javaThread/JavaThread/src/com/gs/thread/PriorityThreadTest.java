package com.gs.thread;

public class PriorityThreadTest {
	
	public static void main(String[] args) {
		PriorityThread1 pt1 = new PriorityThread1();
		PriorityThread2 pt2 = new PriorityThread2();
		Thread t1 = new Thread(pt1);
		// �������ȼ������ȼ���int����ʾ��Thread.MIN_PRIORITY  1    THREAD.MAX_PRIORITY  10
		// ���õ����ȼ�Խ�ߣ���Խ���ױ�ִ��
		// 10����������ȼ������û���������ȼ���Ĭ��ΪThread.NORM_PRIORITY   5   
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread t2 = new Thread(pt2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
