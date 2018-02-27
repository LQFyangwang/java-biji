package com.qq.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JList;

import com.qq.bean.QQAccount;

public class FriendsListMouseMotionListener extends MouseMotionAdapter {

	@SuppressWarnings("unchecked")
	@Override
	public void mouseMoved(MouseEvent e) {
		JList<QQAccount> list = (JList<QQAccount>) e.getSource();
		// JList�ṩ��һ����JList�е�y����ת��ΪJList�е�ĳһ��
		list.setSelectedIndex(list.locationToIndex(e.getPoint())); // ���õ�ǰJList���ĸ������ϵ������ѡ�У�������FriendListCellRenderer�е�getListCellRendererComponent���ж�isSelected�Ƿ�Ϊtrue
	}

}
