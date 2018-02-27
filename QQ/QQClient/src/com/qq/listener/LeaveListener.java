package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import com.qq.bean.Message;
import com.qq.bean.MessageType;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.service.QQAccountService;
import com.qq.service.QQAccountServiceImpl;

public class LeaveListener extends MouseAdapter {
	
	private QQClient qqClient;
	private QQAccount fromAccount;
	
	private QQAccountService accountService;
	
	public LeaveListener(QQClient qqClient, QQAccount fromAccount) {
		this.qqClient = qqClient;
		this.fromAccount = fromAccount;
		this.accountService = new QQAccountServiceImpl();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Message msg = new Message();
		msg.setMessageType(MessageType.LEAVE_MESSAGE);
		msg.setFrom(fromAccount);
		msg.setSendTime(Calendar.getInstance().getTime());
		msg.setMessage("¿Îœﬂ");
		qqClient.sendMessage(msg);
		accountService.updateStatus(fromAccount.getNo(), "offline");
		System.exit(0);
	}

}
