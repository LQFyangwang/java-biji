package com.gs.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	public static final int PORT = 8088; // 定义的端口号， 1024-65535
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT); // 在本机的8088端口号上开一个程序，某个程序监听指定的端口
			System.out.println("服务端正在等待连接……");
			Socket socket = serverSocket.accept(); // 服务端等待客户端的连接，如果有客户端连接到服务端，则生成一个连接对象。如果没有客户端连接，则一直等待
			System.out.println("一个客户端连接上服务端……");
			OutputStream out = socket.getOutputStream(); // 获取服务端的输出流，此输出流可以往客户端输出数据
			out.write("你好，客户端".getBytes()); // 往客户端输出
			out.flush(); // 一旦程序结束，则建立的Socket连接就断开
			Thread.sleep(20 * 1000);
			InputStream in = socket.getInputStream();
			byte[] bytes = new byte[in.available()];
			in.read(bytes); // 
			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

}
