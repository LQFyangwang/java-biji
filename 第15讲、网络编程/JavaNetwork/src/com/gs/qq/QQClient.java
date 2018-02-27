package com.gs.qq;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class QQClient {
	
	private Socket socket;
	
	public void connect() {
		try {
			socket = new Socket(Constants.SERVER, Constants.PORT); // 与服务端建立连接
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * 负责把数据写出到服务端，每写一次，开启一个线程，写完数据后，此线程销毁
	 *
	 */
	private class WriteThread implements Runnable {
		
		private Socket socket;
		
		private String message; // 需要发送到服务端的消息
		
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
