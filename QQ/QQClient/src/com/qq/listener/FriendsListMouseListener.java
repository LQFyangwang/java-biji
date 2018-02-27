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
			// �������촰��
			QQAccount toAccount = list.getSelectedValue(); // ��ȡѡ����
			new ChatFrame(qqClient, fromAccount, toAccount);
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			// ����������ʾ�鿴���ϣ�ɾ�����ѣ���ӵ�������������QQ�ռ䣬�����ʼ�
			JPopupMenu menu = new JPopupMenu();
			JMenuItem viewInfoItem = new JMenuItem("�鿴����");
			FriendListPopupMenuActionListener menuLtn = new FriendListPopupMenuActionListener();
			viewInfoItem.addActionListener(menuLtn);
			JMenuItem visitQZone = new JMenuItem("����QQ�ռ�");
			visitQZone.setIcon(new ImageIcon("src/images/qme.png"));
			visitQZone.addActionListener(menuLtn);
			menu.add(viewInfoItem);
			menu.addSeparator();
			menu.add(visitQZone);
			menu.show(list, e.getX(), e.getY());
		}
	}

}
