package com.gs.qq;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class QQServer {
	
	public void connect() {
		try {
			ServerSocket serverSocket = new ServerSocket(Constants.PORT); // 创建服务端 
			while (true) { // 不停地等待客户端连接，一旦有一个客户端连接上，继续等待其他客户端连接
				System.out.println("服务端等待客户端连接");
				Socket socket = serverSocket.accept();
				System.out.println("一个客户端已连接");
				// 开启此连接的读消息线程
				new Thread(new ReadThread(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 此线程实现类不停地从客户端读取消息，每一个客户端开启一个读线程
	 *
	 */
	private class ReadThread implements Runnable {
		private Socket socket;
		
		private boolean needRead = true; // 是否需要继续读取，当满足某种条件的时候，比如客户端连接关闭了，此时就不需要读数据了
		
		public ReadThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			while (needRead) {
				try {
					InputStream in = socket.getInputStream(); // 获取服务端的输入流
					byte[] bytes = new byte[in.available()];
					in.read(bytes); // 从客户端读入消息
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
