package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.frame.ChatFrame;

public class FriendsListMouseListener extends MouseAdapter {
	
	private QQClient qqClient;
	private QQAccount fromAccount;

	public FriendsListMouseListener(QQClient qqClient, QQAccount fromAccount) {
		this.qqClient = qqClient;
		this.fromAccount = fromAccount;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void mouseClicked(MouseEvent e) {
		JList<QQAccount> list = (JList<QQAccount>) e.getSource();
		if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 2) {
			// 弹出聊天窗口
			QQAccount toAccount = list.getSelectedValue(); // 获取选中项
			new ChatFrame(qqClient, fromAccount, toAccount);
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			// 弹出窗口显示查看资料，删除好友，添加到黑名单，访问QQ空间，发送邮件
			JPopupMenu menu = new JPopupMenu();
			JMenuItem viewInfoItem = new JMenuItem("查看资料");
			FriendListPopupMenuActionListener menuLtn = new FriendListPopupMenuActionListener();
			viewInfoItem.addActionListener(menuLtn);
			JMenuItem visitQZone = new JMenuItem("访问QQ空间");
			visitQZone.setIcon(new ImageIcon("src/images/qme.png"));
			visitQZone.addActionListener(menuLtn);
			menu.add(viewInfoItem);
			menu.addSeparator();
			menu.add(visitQZone);
			menu.show(list, e.getX(), e.getY());
		}
	}

}
