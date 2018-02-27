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
			if (name.equals("login")) {  // ����û�������ǵ�¼,���ȡ���ݣ�������ܺ����ݿ����ж� �Ƿ�Ҫ���˺ţ�������򷵻ش��˺�
				QQAccount account = qqClient.login((String) accBox.getSelectedItem(), EncryptUtil.encrypt(new String(pwdTxt.getPassword())));// ���������ǵ�¼��ť����ʼ��¼����
				if (account != null) { // �ɹ���¼ 
					loginFrame.dispose();
					account.setStatus(AccountStatus.STATUS_ONLINE);
					MainFrame main = new MainFrame(qqClient, account); // ȷʵ���ڸ��˺ţ���չʾ��������
					// �޸�״̬Ϊ����
					accountService.updateStatus(account.getNo(), AccountStatus.STATUS_ONLINE);
				} else {
					JOptionPane.showMessageDialog(loginFrame, "QQ�˺Ż��������", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
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
				lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // getPredefinedCursor(); ����ָ���Ĺ����������ȡԤ����Ĺ��
				lbl.setForeground(new Color(60, 80, 100)); // new Color(int R, int G, int B) R red, G green, B blue    0-255
			} else if (name.equals("login")) {
				lbl.setIcon(new ImageIcon("src/images/login_btn_over.png"));
			}
			
		}
	}
//������ƿ������Ǳ����ɫ
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
