package com.gs.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class QQClient {
	
	public static final int PORT = 8088;
	public static final String SERVER = "localhost";
	
	private Socket socket;
	
	public void connect() {
		try {
			socket = new Socket(SERVER, PORT);
			new Thread(new ReadThread(socket)).start(); // 读数据线程
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	private class WriteThread implements Runnable {
		private Socket socket;
		private String message;
		
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
				System.out.println("客户端发送消息到服务端");
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private class ReadThread implements Runnable {

		private Socket socket; 
		
		public ReadThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			while (true) {
				try {
					InputStream in = socket.getInputStream();
					byte[] bytes = new byte[in.available()];
					in.read(bytes);
					if (bytes.length > 0) {
						System.out.println("消息： " + new String(bytes));
					}
					Thread.sleep(3 * 1000);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void sendMessage(String message) {
		WriteThread writeThread = new WriteThread(socket);
		writeThread.setMessage(message);
		new Thread(writeThread).start();
	}
	
	public static void main(String[] args) {
		QQClient qq = new QQClient();
		qq.connect();
	}
}
