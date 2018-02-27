package com.qq.frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JWindow;

import com.qq.common.ExpressionUtil;
import com.qq.listener.ExpressionListener;

public class ExpressionWindow extends JWindow {

	private static final long serialVersionUID = -9090743350231241758L;
	
	private static final int COUNT = 2;
	
	public ExpressionWindow(ChatFrame chatFrame, JTextPane chatPane, int x, int y) {
		setSize(400, 200);
		setLayout(null);
		ExpressionListener expLtn = new ExpressionListener(chatFrame, chatPane);
		int total = ExpressionUtil.total();
		int expX = 0;
		int expY = 0;
		for (int i = 0; i < total; i++) {
			JLabel exp = new JLabel(new ImageIcon("src/images/expression/" + (i + 1) + ".gif"));
			exp.setBounds(expX, expY, 30, 30);
			expX += 30;
			if ((i + 1) % COUNT == 0) {
				expY += 30;
				expX = 0;
			}
			exp.setName((i + 1) + "");
			exp.addMouseListener(expLtn);
			add(exp);
		}
		setLocation(x, y);
		setVisible(true);
	}

}
