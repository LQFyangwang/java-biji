package com.gs.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static final String	SERVER = "localhost";
	public static final int PORT = 8088;
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(SERVER, PORT); // 第一个参数指定服务端地址，第二个参数是服务端端口
			OutputStream out = socket.getOutputStream();
			out.write("你好，服务端".getBytes());
			out.flush();
			Thread.sleep(10 * 1000);
			InputStream in = socket.getInputStream(); // 获取客户端的输入流，可以读取到服务端输出的信息
			byte[] bytes = new byte[in.available()]; // in.available()获取还有多少个可用的字节
			in.read(bytes); // 把字节数读入到指定的字节数组
			System.out.println(new String(bytes));
		} catch (UnknownHostException e) { // 未知的主机异常，找不到指定的服务端
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

}
