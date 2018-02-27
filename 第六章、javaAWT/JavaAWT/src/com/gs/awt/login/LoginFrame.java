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
		setTitle("QQ登录");
		setLayout(null);
		setLocationRelativeTo(null);
		LoginFrameListener ltn = new LoginFrameListener(this);
		addWindowListener(ltn);
		initWidgets();
		setVisible(true);
	}
	
	/**
	 * 初始化窗口内部的各种组件
	 */
	private void initWidgets() {
		Label accountLbl = new Label("账号"); // 实例化一个指定文本的标签
		accountLbl.setBounds(100, 150, 30, 20);
		add(accountLbl);
		accountTxt = new TextField("默认值");//实例化一个带有默认值的单行文本
		accountTxt.setBounds(140, 150, 150, 20);
		add(accountTxt);
		Label pwdLbl = new Label("密码");
		pwdLbl.setBounds(100, 180, 30, 20);
		add(pwdLbl);
		pwdTxt = new TextField(30); // 实例化一个30个列的文本输入框
		pwdTxt.setText("123456"); // 设置文本框的值
		pwdTxt.setBounds(140, 180, 150, 20);
		add(pwdTxt);
		Button loginBtn = new Button("登录");
		loginBtn.setBounds(100, 210, 200, 20);
		// loginBtn.addActionListener(new LoginListener()); // 添加鼠标监听事件
		// 匿名内部类，创建接口或抽象类的实例，同时实现接口或抽象类里的所有抽象方法，匿名内部类适合于实现简单的类，代码量少的类
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource(); // 获取事件源
				if (obj instanceof Button) {
					Button btn = (Button) obj;
					System.out.println(btn.getLabel()); // 获取按钮的文本信息
					System.out.println(accountTxt.getText()); // 获取输入框的文本
					System.out.println(pwdTxt.getText());
					
					Dialog dialog = new Dialog(LoginFrame.this); 
					// LoginFrame.this通常适用于匿名内部类中想要使用外部类的对象时
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
		 * ActionEvent是事件对象，事件对象里包含有事件源
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource(); // 获取事件源
			if (obj instanceof Button) {
				Button btn = (Button) obj;
				System.out.println(btn.getLabel()); // 获取按钮的文本信息
				System.out.println(accountTxt.getText()); // 获取输入框的文本
				System.out.println(pwdTxt.getText());
			}
		}
		
	}
	
}
