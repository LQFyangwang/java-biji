package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import com.qq.common.ExpressionUtil;
import com.qq.frame.ChatFrame;

public class ExpressionListener extends MouseAdapter {

	private ChatFrame chatFrame;
	private JTextPane chatPane;
	
	public ExpressionListener(ChatFrame chatFrame, JTextPane chatPane) {
		this.chatPane = chatPane;
		this.chatFrame = chatFrame;
	}
	
	/**
	 * ���������ͼ���ʱ����Ҫ֪�����ĸ�λ���ϲ���ͼ�꣬���Ҽ�¼��λ���϶�Ӧ��ͼ���������ʲô
	 * �����¼�ŵ�ChatFrame��Map�ṹ��
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel lbl = (JLabel) e.getSource();
		String name = lbl.getName(); // ��ȡСͼ�������
		String chatText = chatPane.getText(); // ��ȡ�������ַ�����ͼ�������
		int len = chatText.length(); // ��ʱͼ������λ�� 
		ImageIcon icon = ExpressionUtil.getIcon(name); // ����ͼƬ�����ƻ�ȡ������ͼƬ
		chatPane.insertIcon(icon); // ��ͼ����뵽�����
		chatFrame.getIcons().put(len, name);// �����λ���ϲ�������ĸ�ͼ�ꡣ��¼�ĸ� λ�÷����ĸ�ͼ��
	}

}
