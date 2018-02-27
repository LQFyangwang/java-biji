package com.gs.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class QQServer {
	
	public static final int PORT = 8088;
	
	public void connect() {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			while (true) {
				System.out.println("�ȴ��ͻ�������");
				Socket socket = serverSocket.accept();
				System.out.println("һ���ͻ���������");
				ReadThread readThread = new ReadThread(socket);
				new Thread(readThread).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private class ReadThread implements Runnable {
		
		private Socket socket;
		
		private boolean needRead = true;
		
		public ReadThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in);
			while (needRead) {
				try {
					InputStream in = socket.getInputStream();
					byte[] bytes = new byte[in.available()];
					in.read(bytes);
					if (bytes.length > 0) {
						String str = new String(bytes);
						System.out.println("��Ϣ��" + str);
						if (str.equals("end")) {
							needRead = false;
							scanner.close();
						} else {
							String str1 = scanner.next();
							OutputStream out = socket.getOutputStream();
							out.write(str1.getBytes());
							out.flush();
						}
					}
					Thread.sleep(5 * 1000);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
