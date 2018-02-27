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
		setTitle("��¼");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null); // 1. �Ȼ�ȡ�����,2. ����������ò���
//		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//		} catch (ClassNotFoundException e) { // ��δ�ҵ��쳣
//			e.printStackTrace();
//		} catch (InstantiationException e) { // ���ʼ���쳣
//			e.printStackTrace();
//		} catch (IllegalAccessException e) { // �Ƿ������쳣
//			e.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e) { // ��֧�ֵ�LookAndFeel�쳣
//			e.printStackTrace();
//		} // ��������
		initWidgets();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // ����Ĭ�Ϲرղ���
	}
	
	private void initWidgets() {
		JLabel accLbl = new JLabel("�˺�");
		accLbl.setBounds(new Rectangle(100, 200, 50, 20));
		add(accLbl); // ���������ڸ������
		JTextField accTxt = new JTextField(20);
		accTxt.setBounds(new Rectangle(160, 200, 100, 20));
		add(accTxt);
		JLabel pwdLbl = new JLabel("����");
		pwdLbl.setBounds(new Rectangle(100, 230, 50, 20));
		add(pwdLbl);
		JPasswordField pwdTxt = new JPasswordField(20);
		pwdTxt.setBounds(new Rectangle(160, 230, 100, 20));
		add(pwdTxt);
		JButton loginBtn = new JButton("��¼");
		loginBtn.setBounds(new Rectangle(100, 260, 200, 40));
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(LoginFrame.this, "���"); // ���������ģ���һ��������ʾ�����ڶ��󣬵ڶ���������ʾ��ʾ����Ϣ
				char[] charArray = pwdTxt.getPassword(); // pwdTxt.getText()�Ѿ���������
				String msg = "�˺ţ�" + accTxt.getText() + ", ���룺" + String.valueOf(charArray);
				JOptionPane.showMessageDialog(LoginFrame.this, msg, "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				// int result = JOptionPane.showConfirmDialog(LoginFrame.this, "ȷ��ɾ�� ��");
				// JOptionPane.YES_NO_OPTION  �� + ��ť
				// JOptionPane.YES_NO_CANCEL_OPTION   �� + �� + ȡ����ť
				// JOptionPane.YES_OPTION   ��
				// JOptionPane.NO_OPTION   ��  
				// JOptionPane.CANCLE_OPTION   ȡ��
				int result = JOptionPane.showConfirmDialog(LoginFrame.this, "ȷ��ɾ����", "��ʾ", JOptionPane.NO_OPTION);
				if (result == JOptionPane.CANCEL_OPTION) { // ȡ��
					System.out.println("ȡ��");
				} else if (result == JOptionPane.OK_OPTION) {// ��  ȷ��
					System.out.println("ȷ��");
				} else if (result == JOptionPane.NO_OPTION) { // ��
					System.out.println("��");
				}
				// String strResult = JOptionPane.showInputDialog("������ֵ");
				String strResult = JOptionPane.showInputDialog(LoginFrame.this, "������ֵ", "����", JOptionPane.INFORMATION_MESSAGE);
				if (strResult != null) { // �����ȷ����ť������������ֵ
					System.out.println(strResult);
				} else { // �����ȡ����ť��������û������ֵ
					System.out.println("û�������κ�ֵ");
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
