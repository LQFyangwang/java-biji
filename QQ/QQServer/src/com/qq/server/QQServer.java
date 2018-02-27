package com.qq.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

import com.qq.bean.Message;
import com.qq.bean.MessageType;
import com.qq.bean.QQAccount;
import com.qq.common.CommonConstants;

public class QQServer {
	
	// ���ڱ����¼���˻��ʹ��˻���Ӧ��Socket���ӣ�һ���˻���Ӧһ��Socket���ӣ�
	// ��A������Ϣ�� B����Aͨ��A��socket���͵�����ˣ����ٴӷ����ͨ��B��socket���ӷ��͵� B
	private Map<QQAccount, Socket> socketMap;
	
	public QQServer() {
		socketMap = new HashMap<QQAccount, Socket>(); // ʵ����
	}

	/**
	 * ����˿�ʼ���ӣ��ȴ��ͻ��˵����ӣ�
	 */
	public void connect() {
		try {
			ServerSocket serverSocket = new ServerSocket(CommonConstants.PORT);
			while (true) {
				System.out.println("�ȴ��ͻ�������");
				Socket socket = serverSocket.accept();
				System.out.println("һ���ͻ�����������");
				ReadThread readThread = new ReadThread();
				readThread.setSocket(socket); // һ����һ���ͻ��������ϣ�����Ҫ����һ���̵߳�������˿ͻ��˵�����
				new Thread(readThread).start();
			}
		} catch (SocketException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	private class ReadThread implements Runnable {

		private Socket socket;
		
		public Socket getSocket() {
			return socket;
		}

		public void setSocket(Socket socket) {
			this.socket = socket;									
		}

		@Override
		public void run() {
			while (true) {
				try {
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()); // ��ȡ���ӵ�������
					Message message = (Message) ois.readObject(); // ��A�ͻ�����ȡ��Ϣ
					QQAccount from = message.getFrom();
					int messageType = message.getMessageType();
					if (messageType == MessageType.LOGIN_MESSAGE) { // ����յ����ǵ�¼��Ϣ
						socketMap.put(from, socket); // ���һ���˻��ɹ���¼����Ѵ��˻������ӷ��뵽map�б�������
					} else if (messageType == MessageType.TEXT_MESSAGE 
							|| messageType == MessageType.REQUEST_MESSAGE
							|| messageType == MessageType.REQUEST_OK_MESSAGE
							|| messageType == MessageType.REQUEST_NO_MESSAGE
							|| messageType == MessageType.FILE_MESSAGE){ // ����յ������ı���Ϣ
						QQAccount to = message.getTo(); // ��ȡ�������˺�
						Socket socket = socketMap.get(to); // ���ݽ������˺Ż�ȡ����������Ӧ��Socket����
						WriteThread writeThread = new WriteThread();
						writeThread.setSocket(socket); // ����д���������ߵ���Ϣ
						writeThread.setMessage(message); // ����Ϣ���͸�������
						System.out.println(message.getMessage());
						new Thread(writeThread).start();
					} else if (messageType == MessageType.LEAVE_MESSAGE) {
						socketMap.remove(message.getFrom()); // �����ߵ��Ǹ��˵�socket��Map���Ƴ�
						System.out.println(message.getFrom().getNickname() + "����");
						// �����˵��������ߵĺ��ѷ���һ������֪ͨ
					}
				} catch (SocketException e) {
					
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}
	
	private class WriteThread implements Runnable {

		private Socket socket;
		private Message message;
		
		public Socket getSocket() {
			return socket;
		}

		public void setSocket(Socket socket) {
			this.socket = socket;
		}

		public Message getMessage() {
			return message;
		}

		public void setMessage(Message message) {
			this.message = message;
		}

		@Override
		public void run() {
			try {
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // ��ȡ���ӵ������
				oos.writeObject(message); // ����Ϣд��
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
