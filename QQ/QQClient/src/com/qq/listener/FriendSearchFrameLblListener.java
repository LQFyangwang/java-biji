package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.qq.bean.QQAccount;
import com.qq.common.ListToVector;
import com.qq.common.UIUtil;
import com.qq.frame.FriendSearchFrame;
import com.qq.service.QQAccountService;
import com.qq.service.QQAccountServiceImpl;

public class FriendSearchFrameLblListener extends MouseAdapter {
	
	private QQAccountService accountService;
	
	private FriendSearchFrame searchFrame;
	
	private JTextField accountTxt;
	private JTextField nicknameTxt;
	
	public JTextField getAccountTxt() {
		return accountTxt;
	}

	public void setAccountTxt(JTextField accountTxt) {
		this.accountTxt = accountTxt;
	}

	public JTextField getNicknameTxt() {
		return nicknameTxt;
	}

	public void setNicknameTxt(JTextField nicknameTxt) {
		this.nicknameTxt = nicknameTxt;
	}

	public FriendSearchFrameLblListener() {
		accountService = new QQAccountServiceImpl();
	}
	
	public FriendSearchFrame getSearchFrame() {
		return searchFrame;
	}

	public void setSearchFrame(FriendSearchFrame searchFrame) {
		this.searchFrame = searchFrame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("doSearch")) {
				QQAccount account = new QQAccount();
				account.setNickname(nicknameTxt.getText()); // 设置搜索条件
				account.setNo(accountTxt.getText()); // 设置搜索条件
				List<QQAccount> accounts = accountService.queryByCriteria(account); // 搜索出来的结果
				// 重新给整个JTable的TableModel设置数据和列
				searchFrame.getTableModel().setDataVector(ListToVector.list2Vector(accounts), UIUtil.getSearchColumnNames());
			}
		}
	}

}
