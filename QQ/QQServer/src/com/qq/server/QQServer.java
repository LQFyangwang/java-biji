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
	
	// 用于保存登录的账户和此账户对应的Socket连接（一个账户对应一个Socket连接，
	// 从A发送消息到 B，则A通过A的socket发送到服务端），再从服务端通过B的socket连接发送到 B
	private Map<QQAccount, Socket> socketMap;
	
	public QQServer() {
		socketMap = new HashMap<QQAccount, Socket>(); // 实例化
	}

	/**
	 * 服务端开始连接（等待客户端的连接）
	 */
	public void connect() {
		try {
			ServerSocket serverSocket = new ServerSocket(CommonConstants.PORT);
			while (true) {
				System.out.println("等待客户端连接");
				Socket socket = serverSocket.accept();
				System.out.println("一个客户端连接上了");
				ReadThread readThread = new ReadThread();
				readThread.setSocket(socket); // 一旦有一个客户端连接上，则需要开启一个线程单独处理此客户端的输入
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
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()); // 获取连接的输入流
					Message message = (Message) ois.readObject(); // 从A客户端收取消息
					QQAccount from = message.getFrom();
					int messageType = message.getMessageType();
					if (messageType == MessageType.LOGIN_MESSAGE) { // 如果收到的是登录消息
						socketMap.put(from, socket); // 如果一个账户成功登录，则把此账户和连接放入到map中保存起来
					} else if (messageType == MessageType.TEXT_MESSAGE 
							|| messageType == MessageType.REQUEST_MESSAGE
							|| messageType == MessageType.REQUEST_OK_MESSAGE
							|| messageType == MessageType.REQUEST_NO_MESSAGE
							|| messageType == MessageType.FILE_MESSAGE){ // 如果收到的是文本消息
						QQAccount to = message.getTo(); // 获取接收者账号
						Socket socket = socketMap.get(to); // 根据接收者账号获取接收者所对应的Socket连接
						WriteThread writeThread = new WriteThread();
						writeThread.setSocket(socket); // 即将写出到接收者的消息
						writeThread.setMessage(message); // 把消息发送给接收者
						System.out.println(message.getMessage());
						new Thread(writeThread).start();
					} else if (messageType == MessageType.LEAVE_MESSAGE) {
						socketMap.remove(message.getFrom()); // 把离线的那个人的socket从Map里移除
						System.out.println(message.getFrom().getNickname() + "离线");
						// 给此人的所有在线的好友发送一个离线通知
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
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // 获取连接的输出流
				oos.writeObject(message); // 把消息写出
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
