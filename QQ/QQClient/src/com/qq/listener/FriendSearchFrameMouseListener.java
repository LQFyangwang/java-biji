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
			// ������Ҽ�
			JPopupMenu menu = new JPopupMenu(); // ʵ����һ������ʽ�˵�
			FriendSearchActionListener actionLtn = new FriendSearchActionListener();
			String no = (String) table.getModel().getValueAt(table.getSelectedRow(), 1); // ��ȡ�����������һ�е��˺�
			actionLtn.setAccount(qqClient, accountService.queryByNo(no)); // �����˺���Ϣȥ���ݿ�����˻�������Ϣ
			actionLtn.setCurrentAccount(currentAccount);
			JMenuItem viewItem = new JMenuItem("�鿴����");
			viewItem.setActionCommand("viewItem");
			viewItem.addActionListener(actionLtn);
			menu.add(viewItem);
			JMenuItem addItem = new JMenuItem("��Ӻ���");
			addItem.setActionCommand("addItem");
			addItem.addActionListener(actionLtn);
			menu.add(addItem);
			menu.show(table, e.getX(), e.getY());
		}
	}

}
