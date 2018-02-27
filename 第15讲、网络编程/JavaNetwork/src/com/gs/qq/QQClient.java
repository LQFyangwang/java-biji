package com.gs.qq;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class QQClient {
	
	private Socket socket;
	
	public void connect() {
		try {
			socket = new Socket(Constants.SERVER, Constants.PORT); // �����˽�������
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * ���������д��������ˣ�ÿдһ�Σ�����һ���̣߳�д�����ݺ󣬴��߳�����
	 *
	 */
	private class WriteThread implements Runnable {
		
		private Socket socket;
		
		private String message; // ��Ҫ���͵�����˵���Ϣ
		
		public WriteThread(Socket socket) {
			this.socket = socket;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public void run() {
			try {
				OutputStream out = socket.getOutputStream();
				out.write(message.getBytes());
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void sendMessage(String message) {
		WriteThread writeThread = new WriteThread(socket);
		writeThread.setMessage(message);
		new Thread(writeThread).start();
	}

}
