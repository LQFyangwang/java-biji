package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import com.qq.bean.Friends;
import com.qq.bean.Message;
import com.qq.bean.MessageType;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.frame.FriendSearchFrame;
import com.qq.frame.MainFrame;
import com.qq.frame.NoticeThread;
import com.qq.service.FriendsService;
import com.qq.service.FriendsServiceImpl;

public class MainFrameLblMouseListener extends MouseAdapter {
	
	private QQClient qqClient;
	private QQAccount account;
	private MainFrame mainFrame;
	private NoticeThread noticeThread;
	private Message message; 
	
	private FriendsService friendsService; 

	public MainFrameLblMouseListener(QQClient qqClient, QQAccount account) {
		this.qqClient = qqClient;
		this.account = account;
		friendsService = new FriendsServiceImpl();
	}
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("search")) { // 如果点击的是查找按钮，则打开搜索界面
				FriendSearchFrame searchFrame = new FriendSearchFrame(qqClient, account);
			} else if (name.equals("notice")) { // 如果用户点击的是通知图标，则需要先判断此图标是否在闪动，只有在闪动的前提下才意味着有请求消息，否则什么都不要做
				if (mainFrame.isNoticed()) { // 通知还未被点击
					int result = JOptionPane.showConfirmDialog(mainFrame, message.getMessage(), "添加好友", JOptionPane.INFORMATION_MESSAGE);
					Message msg = new Message();
					msg.setFrom(message.getTo());
					msg.setTo(message.getFrom());
					msg.setSendTime(Calendar.getInstance().getTime());
					if (result == JOptionPane.OK_OPTION) {
						// 如果B同意了A添加自己为好友，则发送同意的消息到服务端，服务端再把消息发送到A的账号，A账号的好友列表需要显示出B
						msg.setMessage(message.getTo().getNickname() + "已同意您添加为好友");
						msg.setMessageType(MessageType.REQUEST_OK_MESSAGE);
						qqClient.sendMessage(msg);
						mainFrame.updateFriendList(message.getFrom());
						Friends f = new Friends();
						f.setAccount1(message.getFrom().getNo());
						f.setAccount2(message.getTo().getNo());
						f.setRelationTime(Calendar.getInstance().getTime());
						friendsService.add(f);
					} else if (result == JOptionPane.NO_OPTION) {
						// 如果B不同意A添加自己为好友，则发送一个拒绝消息到服务端，服务端再把消息发送到A的账号
						msg.setMessage(message.getTo().getNickname() + "已拒绝您添加为好友");
						msg.setMessageType(MessageType.REQUEST_NO_MESSAGE);
						qqClient.sendMessage(msg);
					}
					mainFrame.setNoticed(false); // 已经点击了通知
					noticeThread.setChange(false); // 停止切换通知的线程
				}
			} else if (name.equals("status")) { // 如果用户点击的是状态图标，则显示出一个弹出框供修改状态
				JPopupMenu menu = new JPopupMenu();
				JMenuItem onlineItem = new JMenuItem(new ImageIcon("src/images/01.png"));
				menu.add(onlineItem);
				menu.show(mainFrame, e.getX(), e.getY());
			}
		}
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public void setNoticeThread(NoticeThread noticeThread) {
		this.noticeThread = noticeThread;
	}

}
