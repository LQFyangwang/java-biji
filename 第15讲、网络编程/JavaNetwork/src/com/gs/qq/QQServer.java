package com.gs.qq;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class QQServer {
	
	public void connect() {
		try {
			ServerSocket serverSocket = new ServerSocket(Constants.PORT); // ��������� 
			while (true) { // ��ͣ�صȴ��ͻ������ӣ�һ����һ���ͻ��������ϣ������ȴ������ͻ�������
				System.out.println("����˵ȴ��ͻ�������");
				Socket socket = serverSocket.accept();
				System.out.println("һ���ͻ���������");
				// ���������ӵĶ���Ϣ�߳�
				new Thread(new ReadThread(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���߳�ʵ���಻ͣ�شӿͻ��˶�ȡ��Ϣ��ÿһ���ͻ��˿���һ�����߳�
	 *
	 */
	private class ReadThread implements Runnable {
		private Socket socket;
		
		private boolean needRead = true; // �Ƿ���Ҫ������ȡ��������ĳ��������ʱ�򣬱���ͻ������ӹر��ˣ���ʱ�Ͳ���Ҫ��������
		
		public ReadThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			while (needRead) {
				try {
					InputStream in = socket.getInputStream(); // ��ȡ����˵�������
					byte[] bytes = new byte[in.available()];
					in.read(bytes); // �ӿͻ��˶�����Ϣ
					if (bytes.length > 0) {
						System.out.println(new String(bytes));
					}
					// Thread.sleep(5 * 1000);
				} catch (IOException e) {
					e.printStackTrace();
				} 
				
			}
		}
	}

}
