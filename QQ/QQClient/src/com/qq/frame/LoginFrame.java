package com.qq.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

import com.qq.client.QQClient;
import com.qq.listener.FrameMouseMotionListener;
import com.qq.listener.LoginFrameLblMouseListener;
import com.qq.listener.MinExitLblMouseListener;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = -6908272087573007905L;
	
	private QQClient qqClient;
	
	private LoginFrameLblMouseListener lblLtn;
	//登录界面
	public LoginFrame() {
		qqClient = new QQClient(); // 一个登录窗口，对应一个客户端，对应一个连接 
		qqClient.connect(); // 连接到服务端
		setSize(430, 335);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		initTop();
		
		FrameMouseMotionListener lfml = new FrameMouseMotionListener();
		lfml.setFrame(this);
		addMouseMotionListener(lfml);
		addMouseListener(lfml);
		
		initBottom();
		
		setTitle("QQ登录");
		setIconImage(new ImageIcon("src/images/qq_icon.png").getImage()); // 设置登录窗口的图标
		
		setUndecorated(true); // 设置无边框
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void initTop() {
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 430, 170));
		panel.setLayout(null);
		JLabel backLbl = new JLabel(new ImageIcon("src/images/back.jpg"));
		backLbl.setBounds(new Rectangle(0, 0, 430, 170));
		LoginFrameBackThread backThread = new LoginFrameBackThread();
		backThread.setBackLbl(backLbl);
		new Thread(backThread).start();
		panel.add(backLbl); // 添加背景
		initTopButton(backLbl); // 初始化顶部按钮
		add(panel);//界面上面
	}
	
	private void initTopButton(JLabel backLbl) {
		// 设置按钮
		JLabel settingLbl = new JLabel(new ImageIcon("src/images/triangle.png"));
		settingLbl.setBounds(new Rectangle(300, 0, 30, 30));
		backLbl.add(settingLbl);
		MinExitLblMouseListener minExitLtn = new MinExitLblMouseListener();
		minExitLtn.setFrame(this);
		// 最小化按钮
		JLabel minLbl = new JLabel(new ImageIcon("src/images/min_def.png"));
		minLbl.setName("min");
		minLbl.setBounds(330, -10, 50, 50);
		lblLtn = new LoginFrameLblMouseListener(qqClient);
		lblLtn.setLoginFrame(this);
		minLbl.addMouseListener(minExitLtn);
		backLbl.add(minLbl);

		// 退出按钮
		JLabel exitLbl = new JLabel(new ImageIcon("src/images/exit_def.png"));
		exitLbl.setName("exit");
		exitLbl.setBounds(380, -10, 50, 50);
		exitLbl.addMouseListener(minExitLtn);
		backLbl.add(exitLbl);
	
	}
	
	private void initBottom() {
		//下半部分panel界面
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 170, 430, 165);
		
		JLabel headLbl = new JLabel(new ImageIcon("src/images/head.png"));
		headLbl.setBounds(35, 23, 80, 80);
		headLbl.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		panel.add(headLbl);
		add(panel);
		
		//二维码
		JLabel jb=new JLabel(new ImageIcon("src/images/code.png"));
		jb.setName("code");
		jb.setBounds(365,110,70,70);
		panel.add(jb);
		add(panel);
		
		JComboBox<String> accBox = new JComboBox<String>();
		accBox.setEditable(true); // 设置下拉菜单为可编辑
		accBox.setBounds(new Rectangle(128, 23, 194, 30));
		panel.add(accBox);
		
		JPasswordField pwdTxt = new JPasswordField();
		pwdTxt.setBounds(new Rectangle(128, 73, 194, 30));
		panel.add(pwdTxt);
		
		JLabel registerLbl = new JLabel("注册账号");
		registerLbl.setName("register");
		registerLbl.setForeground(Color.BLUE);
		registerLbl.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		registerLbl.setBounds(new Rectangle(333, 23, 80, 30));
		registerLbl.addMouseListener(lblLtn);
		panel.add(registerLbl);
		
		JLabel forgetLbl = new JLabel("忘记密码");
		forgetLbl.setName("forget");
		forgetLbl.setForeground(Color.BLUE);
		forgetLbl.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		forgetLbl.setBounds(new Rectangle(333, 73, 80, 30));
		forgetLbl.addMouseListener(lblLtn);
		panel.add(forgetLbl);
		JLabel loginLbl = new JLabel(new ImageIcon("src/images/login_btn_def.png"));
		loginLbl.setName("login");
		loginLbl.setBounds(128, 123, 194, 30);;
		lblLtn.setAccBox(accBox);
		lblLtn.setPwdTxt(pwdTxt);
		loginLbl.addMouseListener(lblLtn); // 监听登录窗口的鼠标事件
		panel.add(loginLbl);
		
		
	}

}
