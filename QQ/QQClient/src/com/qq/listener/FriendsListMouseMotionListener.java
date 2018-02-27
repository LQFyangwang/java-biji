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
		// JList提供的一个由JList中的y坐标转换为JList中的某一行
		list.setSelectedIndex(list.locationToIndex(e.getPoint())); // 设置当前JList中哪个索引上的组件被选中，则会调用FriendListCellRenderer中的getListCellRendererComponent，判断isSelected是否为true
	}

}
