package com.qq.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import com.qq.bean.QQAccount;

public class SearchInfoDetailFrame extends JFrame {

	private static final long serialVersionUID = 9017641676721056137L;
	
	private QQAccount account;
	
	public SearchInfoDetailFrame(QQAccount account) {
		setSize(400, 200);
		setTitle("查看资料");
		this.account = account;
		
		initInfo();
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	private void initInfo() {
		JLabel nicknameLbl = new JLabel(account.getNickname());
		add(nicknameLbl);
	}

}
