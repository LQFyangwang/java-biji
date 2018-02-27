package com.gs.qq;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ChatFrame extends JFrame {

	public ChatFrame() {
		QQClient qqClient = new QQClient(); // 开始QQ客户端 
		qqClient.connect(); // 连接服务端
		setSize(400 ,400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new FlowLayout());
		JTextField txtMsg = new JTextField(50);
		add(txtMsg);
		JButton sendBtn = new JButton("发送");
		sendBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				qqClient.sendMessage(txtMsg.getText());
			}
			
		});
		add(sendBtn);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
