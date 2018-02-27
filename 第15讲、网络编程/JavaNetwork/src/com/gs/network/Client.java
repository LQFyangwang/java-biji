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
			Socket socket = new Socket(SERVER, PORT); // ��һ������ָ������˵�ַ���ڶ��������Ƿ���˶˿�
			OutputStream out = socket.getOutputStream();
			out.write("��ã������".getBytes());
			out.flush();
			Thread.sleep(10 * 1000);
			InputStream in = socket.getInputStream(); // ��ȡ�ͻ��˵������������Զ�ȡ��������������Ϣ
			byte[] bytes = new byte[in.available()]; // in.available()��ȡ���ж��ٸ����õ��ֽ�
			in.read(bytes); // ���ֽ������뵽ָ�����ֽ�����
			System.out.println(new String(bytes));
		} catch (UnknownHostException e) { // δ֪�������쳣���Ҳ���ָ���ķ����
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

}
