package com.qq.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Calendar;

import com.qq.bean.Friends;
import com.qq.bean.Message;
import com.qq.bean.MessageType;
import com.qq.bean.QQAccount;
import com.qq.common.CommonConstants;
import com.qq.common.FileUtil;
import com.qq.frame.ChatFrame;
import com.qq.frame.MainFrame;
import com.qq.service.FriendsService;
import com.qq.service.FriendsServiceImpl;
import com.qq.service.QQAccountService;
import com.qq.service.QQAccountServiceImpl;

public class QQClient {
	
	private Socket socket;
	
	private QQAccountService accountService;
	private FriendsService friendsService;
	
	private ChatFrame chatFrame;
	private MainFrame mainFrame;
	
	public QQClient() {
		accountService = new QQAccountServiceImpl();
		friendsService = new FriendsServiceImpl();
	}
	
	public ChatFrame getChatFrame() {
		return chatFrame;
	}

	public void setChatFrame(ChatFrame chatFrame) {
		this.chatFrame = chatFrame;
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public void connect() {
		try {
			socket = new Socket(CommonConstants.SERVER, CommonConstants.PORT); // 连接到服务端 
			ReadThread readThread = new ReadThread();
			readThread.setSocket(socket);
			new Thread(readThread).start(); // 一旦连接到服务端，此连接需要不停地去从服务端读消息
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
					Message message = (Message) ois.readObject();
					if (message.getMessageType() == MessageType.TEXT_MESSAGE) {
						chatFrame.updateChat(message); // 如果读取到了文本消，则更新聊天窗口中的文本框的值
					} else if (message.getMessageType() == MessageType.REQUEST_MESSAGE) { 
						mainFrame.updateNotice(message); // 如果是请求消息，则更新通知图标
					} else if (message.getMessageType() == MessageType.REQUEST_OK_MESSAGE) {
						// 把添加的好友显示到好友列表
						mainFrame.updateFriendList(message.getFrom());
						Friends f = new Friends();
						f.setAccount1(message.getFrom().getNo());
						f.setAccount2(message.getTo().getNo());
						f.setRelationTime(Calendar.getInstance().getTime());
						friendsService.add(f);
					} else if (message.getMessageType() == MessageType.REQUEST_NO_MESSAGE) {
						mainFrame.updateNotice(message);
					} else if (message.getMessageType() == MessageType.FILE_MESSAGE) {
						FileUtil.saveFile(message.getFrom().getNo(), message.getMessage(), message.getData());
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
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 用于启动发送消息的线程，把消息发送到服务端 
	 * @param message
	 */
	public void sendMessage(Message message) {
		WriteThread writeThread = new WriteThread();
		writeThread.setSocket(socket);
		writeThread.setMessage(message);
		new Thread(writeThread).start();
	}
	
	/**
	 * 登录判断的方法，如果登录成功，则返回账户，否则返回null
	 * @param no
	 * @param pwd               
	 * @return
	 */
	public QQAccount login(String no, String pwd) {
		// 1、查询数据库中是否有该账号
		QQAccount account = accountService.queryByNoPwd(no, pwd);
		if (account != null) {
			Message message = new Message();
			message.setFrom(account);
			message.setSendTime(Calendar.getInstance().getTime());
			message.setMessage("登录");
			message.setMessageType(MessageType.LOGIN_MESSAGE);
			// 2、如果有该账号，则登录成功，需要把登录状态发送到服务端
			sendMessage(message);
			return account;
		} else {
			return null;
		}
	}

}
