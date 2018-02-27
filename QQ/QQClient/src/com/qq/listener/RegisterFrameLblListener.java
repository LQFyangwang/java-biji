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
			if (name.equals("reg")) { // 如果用户点击了注册，则获取相关信息，判断密码是否不为空，且两次密码是否一致，如果ok，则对密码进行加密后调用service把数据存储到db
				char[] pwdArray = regFrame.getPwdTxt().getPassword();
				char[] pwdConArray = regFrame.getConPwdTxt().getPassword();
				if (pwdArray.length > 0 && pwdConArray.length > 0) {
					String pwd = new String(pwdArray);
					String conPwd = new String(pwdConArray);
					if (pwd.equals(conPwd)) {
						String no = saveAccount(conPwd); 
						if (no != null) {
							int result = JOptionPane.showConfirmDialog(regFrame, "注册成功，请登录。您的账号是：" + no, "提示", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
							if (result == JOptionPane.OK_OPTION) {
								regFrame.dispose();
							} 
						}
					} else {
						JOptionPane.showMessageDialog(regFrame, "密码和确认密码不一致", "提示", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(regFrame, "请输入密码和确认密码", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	
	private String saveAccount(String conPwd) {
		// 需要对此账号进行判断，判断是否在数据库中已经有该账号，如果有该账号，重新随机生成一个
		String no = String.valueOf(RandomAccount.randomAccount());
		if (!qqService.isAccountExist(no)) { // 此账号已经存在
			QQAccount account = new QQAccount();
			account.setNo(no);
			account.setNickname(regFrame.getNicknameTxt().getText());
			account.setPwd(EncryptUtil.encrypt(conPwd));
			qqService.add(account); // 保存注册的QQ账号
			return no;
		} else { // 此账号存在
			saveAccount(conPwd); // 递归调用自己
		}
		return null;
	}

}
