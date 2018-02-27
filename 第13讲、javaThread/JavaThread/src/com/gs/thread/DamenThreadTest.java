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
		t.setDaemon(true); // 设置守候线程（后台跑的线程）
		t.start();
		System.out.println(t.isAlive());
	}

}
