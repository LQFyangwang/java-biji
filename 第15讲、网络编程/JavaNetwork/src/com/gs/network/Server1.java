package com.gs.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	public static final int PORT = 8088;
	
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(PORT);
			while (true) {
				System.out.println("正在等待连接");
				Socket s = ss.accept();//说明Socket 套接字  IP地址:端口号已经连接
				System.out.println("一个客户端连接上");
				OutputStream out = s.getOutputStream();//输出
				out.write("你好".getBytes());
				out.flush();// 一旦程序结束，则建立的Socket连接就断开
				System.out.println("发送消息到客户端");
				Thread.sleep(20 * 1000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
