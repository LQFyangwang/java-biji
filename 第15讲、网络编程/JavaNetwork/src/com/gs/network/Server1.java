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
				System.out.println("���ڵȴ�����");
				Socket s = ss.accept();//˵��Socket �׽���  IP��ַ:�˿ں��Ѿ�����
				System.out.println("һ���ͻ���������");
				OutputStream out = s.getOutputStream();//���
				out.write("���".getBytes());
				out.flush();// һ�����������������Socket���ӾͶϿ�
				System.out.println("������Ϣ���ͻ���");
				Thread.sleep(20 * 1000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
