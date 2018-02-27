package com.qq.frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.qq.common.UIUtil;
import com.qq.listener.RegisterFrameLblListener;

public class RegisterFrame extends JFrame {

	private static final long serialVersionUID = 1340128017961470845L;
	
	private JTextField nicknameTxt;
	private JPasswordField pwdTxt;
	private JPasswordField conPwdTxt;
	
	public RegisterFrame() {
		setSize(600, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		initWidgets();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public JTextField getNicknameTxt() {
		return nicknameTxt;
	}

	public JPasswordField getPwdTxt() {
		return pwdTxt;
	}

	public JPasswordField getConPwdTxt() {
		return conPwdTxt;
	}

	private void initWidgets() {
		JLabel nicknameLbl = new JLabel("昵称");
		nicknameLbl.setBounds(30, 50, 80, 30);
		nicknameLbl.setFont(UIUtil.myFont(16));
		nicknameTxt = new JTextField(30);
		nicknameTxt.setBounds(120, 50, 300, 30);
		add(nicknameLbl);
		add(nicknameTxt);
		JLabel pwdLbl = new JLabel("密码");
		pwdLbl.setBounds(30, 100, 80, 30);
		pwdLbl.setFont(UIUtil.myFont(16));
		pwdTxt = new JPasswordField(30);
		pwdTxt.setBounds(120, 100, 300, 30);
		add(pwdLbl);
		add(pwdTxt);
		JLabel conPwdLbl = new JLabel("确认密码");
		conPwdLbl.setBounds(30, 150, 80, 30);
		conPwdLbl.setFont(UIUtil.myFont(16));
		conPwdTxt = new JPasswordField(30);
		conPwdTxt.setBounds(120, 150, 300, 30);
		add(conPwdLbl);
		add(conPwdTxt);
		
		JLabel regLbl = new JLabel(new ImageIcon("src/images/reg.png"));
		regLbl.setBounds(50, 200, 303, 51);
		regLbl.setName("reg");
		RegisterFrameLblListener rfLtn = new RegisterFrameLblListener();
		rfLtn.setRegFrame(this);
		regLbl.addMouseListener(rfLtn); // 监听鼠标点击事件
		add(regLbl);
	}

}
