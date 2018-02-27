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
	 * 当点击插入图标的时候，需要知道在哪个位置上插入图标，并且记录此位置上对应的图标的名称是什么
	 * 这个记录放到ChatFrame的Map结构里
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel lbl = (JLabel) e.getSource();
		String name = lbl.getName(); // 获取小图标的名称
		String chatText = chatPane.getText(); // 获取包含有字符串和图标的内容
		int len = chatText.length(); // 此时图标插入的位置 
		ImageIcon icon = ExpressionUtil.getIcon(name); // 根据图片的名称获取到表情图片
		chatPane.insertIcon(icon); // 把图标插入到输入框
		chatFrame.getIcons().put(len, name);// 在这个位置上插入的是哪个图标。记录哪个 位置放了哪个图标
	}

}
