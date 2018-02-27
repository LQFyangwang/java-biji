package com.gs.awt.login;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame {

	private static final long serialVersionUID = 4253541541160550823L;

	private TextField accountTxt;
	private TextField pwdTxt;
	
	public LoginFrame() {
		setSize(400, 300);
		setTitle("QQ��¼");
		setLayout(null);
		setLocationRelativeTo(null);
		LoginFrameListener ltn = new LoginFrameListener(this);
		addWindowListener(ltn);
		initWidgets();
		setVisible(true);
	}
	
	/**
	 * ��ʼ�������ڲ��ĸ������
	 */
	private void initWidgets() {
		Label accountLbl = new Label("�˺�"); // ʵ����һ��ָ���ı��ı�ǩ
		accountLbl.setBounds(100, 150, 30, 20);
		add(accountLbl);
		accountTxt = new TextField("Ĭ��ֵ");//ʵ����һ������Ĭ��ֵ�ĵ����ı�
		accountTxt.setBounds(140, 150, 150, 20);
		add(accountTxt);
		Label pwdLbl = new Label("����");
		pwdLbl.setBounds(100, 180, 30, 20);
		add(pwdLbl);
		pwdTxt = new TextField(30); // ʵ����һ��30���е��ı������
		pwdTxt.setText("123456"); // �����ı����ֵ
		pwdTxt.setBounds(140, 180, 150, 20);
		add(pwdTxt);
		Button loginBtn = new Button("��¼");
		loginBtn.setBounds(100, 210, 200, 20);
		// loginBtn.addActionListener(new LoginListener()); // ����������¼�
		// �����ڲ��࣬�����ӿڻ�������ʵ����ͬʱʵ�ֽӿڻ������������г��󷽷��������ڲ����ʺ���ʵ�ּ򵥵��࣬�������ٵ���
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource(); // ��ȡ�¼�Դ
				if (obj instanceof Button) {
					Button btn = (Button) obj;
					System.out.println(btn.getLabel()); // ��ȡ��ť���ı���Ϣ
					System.out.println(accountTxt.getText()); // ��ȡ�������ı�
					System.out.println(pwdTxt.getText());
					
					Dialog dialog = new Dialog(LoginFrame.this); 
					// LoginFrame.thisͨ�������������ڲ�������Ҫʹ���ⲿ��Ķ���ʱ
					Label accLbl = new Label(accountTxt.getText());
					Label pwdLbl = new Label(pwdTxt.getText());
					dialog.setLayout(new FlowLayout());
					dialog.setSize(100, 100);
					dialog.setLocationRelativeTo(null);
					dialog.add(accLbl);
					dialog.add(pwdLbl);
					dialog.setVisible(true);
				}
			}
			
		});
		add(loginBtn);
	}
	
	private class LoginListener implements ActionListener {

		/**
		 * ActionEvent���¼������¼�������������¼�Դ
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource(); // ��ȡ�¼�Դ
			if (obj instanceof Button) {
				Button btn = (Button) obj;
				System.out.println(btn.getLabel()); // ��ȡ��ť���ı���Ϣ
				System.out.println(accountTxt.getText()); // ��ȡ�������ı�
				System.out.println(pwdTxt.getText());
			}
		}
		
	}
	
}
