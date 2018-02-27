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
			if (name.equals("search")) { // ���������ǲ��Ұ�ť�������������
				FriendSearchFrame searchFrame = new FriendSearchFrame(qqClient, account);
			} else if (name.equals("notice")) { // ����û��������֪ͨͼ�꣬����Ҫ���жϴ�ͼ���Ƿ���������ֻ����������ǰ���²���ζ����������Ϣ������ʲô����Ҫ��
				if (mainFrame.isNoticed()) { // ֪ͨ��δ�����
					int result = JOptionPane.showConfirmDialog(mainFrame, message.getMessage(), "��Ӻ���", JOptionPane.INFORMATION_MESSAGE);
					Message msg = new Message();
					msg.setFrom(message.getTo());
					msg.setTo(message.getFrom());
					msg.setSendTime(Calendar.getInstance().getTime());
					if (result == JOptionPane.OK_OPTION) {
						// ���Bͬ����A����Լ�Ϊ���ѣ�����ͬ�����Ϣ������ˣ�������ٰ���Ϣ���͵�A���˺ţ�A�˺ŵĺ����б���Ҫ��ʾ��B
						msg.setMessage(message.getTo().getNickname() + "��ͬ�������Ϊ����");
						msg.setMessageType(MessageType.REQUEST_OK_MESSAGE);
						qqClient.sendMessage(msg);
						mainFrame.updateFriendList(message.getFrom());
						Friends f = new Friends();
						f.setAccount1(message.getFrom().getNo());
						f.setAccount2(message.getTo().getNo());
						f.setRelationTime(Calendar.getInstance().getTime());
						friendsService.add(f);
					} else if (result == JOptionPane.NO_OPTION) {
						// ���B��ͬ��A����Լ�Ϊ���ѣ�����һ���ܾ���Ϣ������ˣ�������ٰ���Ϣ���͵�A���˺�
						msg.setMessage(message.getTo().getNickname() + "�Ѿܾ������Ϊ����");
						msg.setMessageType(MessageType.REQUEST_NO_MESSAGE);
						qqClient.sendMessage(msg);
					}
					mainFrame.setNoticed(false); // �Ѿ������֪ͨ
					noticeThread.setChange(false); // ֹͣ�л�֪ͨ���߳�
				}
			} else if (name.equals("status")) { // ����û��������״̬ͼ�꣬����ʾ��һ���������޸�״̬
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
