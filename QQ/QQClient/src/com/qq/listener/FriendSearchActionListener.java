package com.qq.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import com.qq.bean.Message;
import com.qq.bean.MessageType;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.frame.SearchInfoDetailFrame;

public class FriendSearchActionListener implements ActionListener {

	private QQClient qqClient;
	private QQAccount account;	
	private QQAccount currentAccount;
	
	public QQAccount getAccount() {
		return account;
	}

	public void setAccount(QQClient qqClient, QQAccount account) {
		this.qqClient = qqClient;	
		this.account = account;
	}

	public QQAccount getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(QQAccount currentAccount) {
		this.currentAccount = currentAccount;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("viewItem")) { // ���������ǲ鿴���ϣ��򵯳�һ���´�������ʾ������Ϣ
			new SearchInfoDetailFrame(account);
		} else if (action.equals("addItem")) { // ������������Ӻ��ѣ������QQClient��������Ϣ
			Message message = new Message();
			message.setFrom(currentAccount);
			message.setTo(account);
			message.setMessage(currentAccount.getNickname() + "���������Ϊ����");
			message.setMessageType(MessageType.REQUEST_MESSAGE); // ������Ϣ����Ϊ������Ϣ
			message.setSendTime(Calendar.getInstance().getTime());
			qqClient.sendMessage(message);
		}
	}

}
