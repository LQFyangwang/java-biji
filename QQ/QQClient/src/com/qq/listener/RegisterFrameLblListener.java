package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.qq.bean.QQAccount;
import com.qq.common.EncryptUtil;
import com.qq.common.RandomAccount;
import com.qq.frame.RegisterFrame;
import com.qq.service.QQAccountService;
import com.qq.service.QQAccountServiceImpl;

public class RegisterFrameLblListener extends MouseAdapter {
	
	private QQAccountService qqService;
	
	private RegisterFrame regFrame;
	
	public RegisterFrameLblListener() {
		qqService = new QQAccountServiceImpl();
	}

	public RegisterFrame getRegFrame() {
		return regFrame;
	}

	public void setRegFrame(RegisterFrame regFrame) {
		this.regFrame = regFrame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("reg")) { // ����û������ע�ᣬ���ȡ�����Ϣ���ж������Ƿ�Ϊ�գ������������Ƿ�һ�£����ok�����������м��ܺ����service�����ݴ洢��db
				char[] pwdArray = regFrame.getPwdTxt().getPassword();
				char[] pwdConArray = regFrame.getConPwdTxt().getPassword();
				if (pwdArray.length > 0 && pwdConArray.length > 0) {
					String pwd = new String(pwdArray);
					String conPwd = new String(pwdConArray);
					if (pwd.equals(conPwd)) {
						String no = saveAccount(conPwd); 
						if (no != null) {
							int result = JOptionPane.showConfirmDialog(regFrame, "ע��ɹ������¼�������˺��ǣ�" + no, "��ʾ", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
							if (result == JOptionPane.OK_OPTION) {
								regFrame.dispose();
							} 
						}
					} else {
						JOptionPane.showMessageDialog(regFrame, "�����ȷ�����벻һ��", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(regFrame, "�����������ȷ������", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	
	private String saveAccount(String conPwd) {
		// ��Ҫ�Դ��˺Ž����жϣ��ж��Ƿ������ݿ����Ѿ��и��˺ţ�����и��˺ţ������������һ��
		String no = String.valueOf(RandomAccount.randomAccount());
		if (!qqService.isAccountExist(no)) { // ���˺��Ѿ�����
			QQAccount account = new QQAccount();
			account.setNo(no);
			account.setNickname(regFrame.getNicknameTxt().getText());
			account.setPwd(EncryptUtil.encrypt(conPwd));
			qqService.add(account); // ����ע���QQ�˺�
			return no;
		} else { // ���˺Ŵ���
			saveAccount(conPwd); // �ݹ�����Լ�
		}
		return null;
	}

}
