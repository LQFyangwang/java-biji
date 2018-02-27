package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.service.QQAccountService;
import com.qq.service.QQAccountServiceImpl;

public class FriendSearchFrameMouseListener extends MouseAdapter {
	
	private QQClient qqClient;
	private QQAccount currentAccount;
	private QQAccountService accountService;
	private JTable table;
	
	public FriendSearchFrameMouseListener(QQClient qqClient, QQAccount currentAccount) {
		accountService = new QQAccountServiceImpl();
		this.qqClient = qqClient;
		this.currentAccount = currentAccount;
	}
	
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int btn = e.getButton();
		if (btn == MouseEvent.BUTTON1) {
			// 点击了右键
			JPopupMenu menu = new JPopupMenu(); // 实例化一个弹出式菜单
			FriendSearchActionListener actionLtn = new FriendSearchActionListener();
			String no = (String) table.getModel().getValueAt(table.getSelectedRow(), 1); // 获取到鼠标点击的那一行的账号
			actionLtn.setAccount(qqClient, accountService.queryByNo(no)); // 根据账号信息去数据库查找账户所有信息
			actionLtn.setCurrentAccount(currentAccount);
			JMenuItem viewItem = new JMenuItem("查看资料");
			viewItem.setActionCommand("viewItem");
			viewItem.addActionListener(actionLtn);
			menu.add(viewItem);
			JMenuItem addItem = new JMenuItem("添加好友");
			addItem.setActionCommand("addItem");
			addItem.addActionListener(actionLtn);
			menu.add(addItem);
			menu.show(table, e.getX(), e.getY());
		}
	}

}
