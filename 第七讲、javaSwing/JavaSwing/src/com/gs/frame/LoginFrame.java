package com.gs.frame;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = -7980496791932038245L;
	
	public LoginFrame() {
		setSize(400, 400);
		setTitle("登录");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null); // 1. 先获取根面板,2. 给根面板设置布局
//		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//		} catch (ClassNotFoundException e) { // 类未找到异常
//			e.printStackTrace();
//		} catch (InstantiationException e) { // 类初始化异常
//			e.printStackTrace();
//		} catch (IllegalAccessException e) { // 非法访问异常
//			e.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e) { // 不支持的LookAndFeel异常
//			e.printStackTrace();
//		} // 设置主题
		initWidgets();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 设置默认关闭操作
	}
	
	private void initWidgets() {
		JLabel accLbl = new JLabel("账号");
		accLbl.setBounds(new Rectangle(100, 200, 50, 20));
		add(accLbl); // 把组件添加在根面板上
		JTextField accTxt = new JTextField(20);
		accTxt.setBounds(new Rectangle(160, 200, 100, 20));
		add(accTxt);
		JLabel pwdLbl = new JLabel("密码");
		pwdLbl.setBounds(new Rectangle(100, 230, 50, 20));
		add(pwdLbl);
		JPasswordField pwdTxt = new JPasswordField(20);
		pwdTxt.setBounds(new Rectangle(160, 230, 100, 20));
		add(pwdTxt);
		JButton loginBtn = new JButton("登录");
		loginBtn.setBounds(new Rectangle(100, 260, 200, 40));
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(LoginFrame.this, "你好"); // 两个参数的，第一个参数表示父窗口对象，第二个参数表示显示的信息
				char[] charArray = pwdTxt.getPassword(); // pwdTxt.getText()已经被弃用了
				String msg = "账号：" + accTxt.getText() + ", 密码：" + String.valueOf(charArray);
				JOptionPane.showMessageDialog(LoginFrame.this, msg, "提示", JOptionPane.INFORMATION_MESSAGE);
				// int result = JOptionPane.showConfirmDialog(LoginFrame.this, "确定删除 ？");
				// JOptionPane.YES_NO_OPTION  是 + 否按钮
				// JOptionPane.YES_NO_CANCEL_OPTION   是 + 否 + 取消按钮
				// JOptionPane.YES_OPTION   是
				// JOptionPane.NO_OPTION   否  
				// JOptionPane.CANCLE_OPTION   取消
				int result = JOptionPane.showConfirmDialog(LoginFrame.this, "确定删除？", "提示", JOptionPane.NO_OPTION);
				if (result == JOptionPane.CANCEL_OPTION) { // 取消
					System.out.println("取消");
				} else if (result == JOptionPane.OK_OPTION) {// 是  确定
					System.out.println("确定");
				} else if (result == JOptionPane.NO_OPTION) { // 否
					System.out.println("否");
				}
				// String strResult = JOptionPane.showInputDialog("请输入值");
				String strResult = JOptionPane.showInputDialog(LoginFrame.this, "请输入值", "输入", JOptionPane.INFORMATION_MESSAGE);
				if (strResult != null) { // 点击了确定按钮，并且有输入值
					System.out.println(strResult);
				} else { // 点击了取消按钮，不管有没有输入值
					System.out.println("没有输入任何值");
				}
			}
			
		});
		add(loginBtn);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new LoginFrame();
			}
			
		});
	}

}
