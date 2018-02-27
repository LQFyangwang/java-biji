package com.gs.thread;

public class ABCThread1 implements Runnable {
	
	private boolean needRun = true;

	public boolean isNeedRun() {
		return needRun;
	}

	public void setNeedRun(boolean needRun) {
		this.needRun = needRun;
	}

	@Override
	public void run() {
		while (needRun) {
			System.out.println("abc, " + Thread.currentThread().getName()); // ���̲߳�ͣ��ӡabc
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
