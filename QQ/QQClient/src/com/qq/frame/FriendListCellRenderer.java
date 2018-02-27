package com.qq.frame;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import com.qq.bean.QQAccount;

public class FriendListCellRenderer implements ListCellRenderer<QQAccount> {

	/**
	 * 表示返回JList中每一个单元格的样式（控件）
	 */
	@Override
	public Component getListCellRendererComponent(JList<? extends QQAccount> list, QQAccount account, int index,
			boolean isSelected, boolean cellHasFocus) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		if (isSelected) { // 判断单元格是否被选中，被选中的那个单元格不需要完全透明，只需要半透明
			panel.setOpaque(true);
			panel.setBackground(new Color(0.1f, 0.1f, 0.1f, 0.5f));
		} else {
			panel.setOpaque(false);
		}
		ImageIcon headIcon = null;
		if (account.getHeadIcon() == null) {
			headIcon = new ImageIcon("src/images/head/head.png");
		} else {
			headIcon = new ImageIcon("src/images/head/" + account.getHeadIcon());
		}
		JLabel headLbl = new JLabel(headIcon);
		headLbl.setBounds(2, 2, 50, 50);
		JLabel nicknameLbl = new JLabel(account.getNickname());
		nicknameLbl.setBounds(60, 2, 200, 25);
		panel.add(headLbl);
		panel.add(nicknameLbl);
		ImageIcon statusIcon = null;
		if (account.getStatus().equals("online")) {
			statusIcon = new ImageIcon("src/images/online.png");
		} else if (account.getStatus().equals("offline")) {
			statusIcon = new ImageIcon("src/images/xunzhang.png");
		}
		JLabel statusLbl = new JLabel(statusIcon);
		statusLbl.setBounds(110, 2, 60, 25);
		panel.add(statusLbl);
		return panel;
	}

}
