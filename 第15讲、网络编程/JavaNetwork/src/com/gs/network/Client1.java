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
			System.out.println("�Ѿ������Ϸ���� ");
			InputStream in = s.getInputStream();
			Thread.sleep(10 * 1000); // �ȴ�10�����ȥ���ӷ���˷�����������
			System.out.println("��ʼ��ȡ��Ϣ");
			byte[] bytes = new byte[in.available()];
			in.read(bytes);
			System.out.println("�ӷ���˽�����Ϣ");
			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
