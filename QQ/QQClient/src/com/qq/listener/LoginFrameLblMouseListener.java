package com.qq.listener;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import com.qq.bean.AccountStatus;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.common.EncryptUtil;
import com.qq.frame.LoginFrame;
import com.qq.frame.MainFrame;
import com.qq.frame.RegisterFrame;
import com.qq.service.QQAccountService;
import com.qq.service.QQAccountServiceImpl;

public class LoginFrameLblMouseListener extends MouseAdapter {

	private LoginFrame loginFrame;
	
	private QQClient qqClient;
	
	private JComboBox<String> accBox;
	private JPasswordField pwdTxt;
	
	private QQAccountService accountService;
	
	public LoginFrameLblMouseListener(QQClient qqClient) {
		this.qqClient = qqClient;
		accountService = new QQAccountServiceImpl();
	}
	
	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	public JComboBox<String> getAccBox() {
		return accBox;
	}

	public void setAccBox(JComboBox<String> accBox) {
		this.accBox = accBox;
	}

	public JPasswordField getPwdTxt() {
		return pwdTxt;
	}

	public void setPwdTxt(JPasswordField pwdTxt) {
		this.pwdTxt = pwdTxt;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("login")) {  // 如果用户点击的是登录,则获取数据，密码加密后到数据库中判断 是否要该账号，如果有则返回此账号
				QQAccount account = qqClient.login((String) accBox.getSelectedItem(), EncryptUtil.encrypt(new String(pwdTxt.getPassword())));// 如果点击的是登录按钮，则开始登录操作
				if (account != null) { // 成功登录 
					loginFrame.dispose();
					account.setStatus(AccountStatus.STATUS_ONLINE);
					MainFrame main = new MainFrame(qqClient, account); // 确实存在该账号，则展示出主窗口
					// 修改状态为在线
					accountService.updateStatus(account.getNo(), AccountStatus.STATUS_ONLINE);
				} else {
					JOptionPane.showMessageDialog(loginFrame, "QQ账号或密码错误", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
			} else if (name.equals("register")) {
				new RegisterFrame();
			}
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("register") || name.equals("forget")) {
				lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // getPredefinedCursor(); 根据指定的光标类型来获取预定义的光标
				lbl.setForeground(new Color(60, 80, 100)); // new Color(int R, int G, int B) R red, G green, B blue    0-255
			} else if (name.equals("login")) {
				lbl.setIcon(new ImageIcon("src/images/login_btn_over.png"));
			}
			
		}
	}
//当鼠标移开字体是变回蓝色
	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("register") || name.equals("forget")) {
				lbl.setForeground(Color.BLUE);
			} else if (name.equals("login")) {
				lbl.setIcon(new ImageIcon("src/images/login_btn_def.png"));
			}
		}
	}

}
