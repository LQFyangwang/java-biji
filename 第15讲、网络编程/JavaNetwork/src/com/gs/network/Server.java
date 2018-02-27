package com.gs.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	public static final int PORT = 8088; // ����Ķ˿ںţ� 1024-65535
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT); // �ڱ�����8088�˿ں��Ͽ�һ������ĳ���������ָ���Ķ˿�
			System.out.println("��������ڵȴ����ӡ���");
			Socket socket = serverSocket.accept(); // ����˵ȴ��ͻ��˵����ӣ�����пͻ������ӵ�����ˣ�������һ�����Ӷ������û�пͻ������ӣ���һֱ�ȴ�
			System.out.println("һ���ͻ��������Ϸ���ˡ���");
			OutputStream out = socket.getOutputStream(); // ��ȡ����˵����������������������ͻ����������
			out.write("��ã��ͻ���".getBytes()); // ���ͻ������
			out.flush(); // һ�����������������Socket���ӾͶϿ�
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
