package com.gs.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {
	
	public static final String SERVER = "localhost";
	public static final int PORT = 8088;
	
	public static void main(String[] args) {
		try {
			Socket s = new Socket(SERVER, PORT);
			System.out.println("已经连接上服务端 ");
			InputStream in = s.getInputStream();
			Thread.sleep(10 * 1000); // 等待10秒后再去读从服务端发过来的数据
			System.out.println("开始读取消息");
			byte[] bytes = new byte[in.available()];
			in.read(bytes);
			System.out.println("从服务端接收消息");
			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
