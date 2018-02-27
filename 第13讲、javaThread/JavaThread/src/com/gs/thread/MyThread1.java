package com.gs.thread;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("mythread1");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1()); // ��ʵ����Runnable�ӿڵ�����Thread���װһ�£���װ����������߳�
		t1.setName("mythread1");
		System.out.println(Thread.currentThread().getName());
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread 2");
			}
			
		});
		t2.setName("t2");
		t2.start();
	}

}
