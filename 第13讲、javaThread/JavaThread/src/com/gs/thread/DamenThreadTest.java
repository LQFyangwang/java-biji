package com.gs.thread;

public class DamenThreadTest implements Runnable {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("damen thread");
		}
	}
	
	public static void main(String[] args) {
		DamenThreadTest dtt = new DamenThreadTest();
		Thread t = new Thread(dtt);
		t.setDaemon(true); // �����غ��̣߳���̨�ܵ��̣߳�
		t.start();
		System.out.println(t.isAlive());
	}

}
