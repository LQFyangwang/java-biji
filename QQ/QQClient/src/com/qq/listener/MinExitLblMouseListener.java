package com.qq.listener;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinExitLblMouseListener extends MouseAdapter {
	
	private JFrame frame;
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("min")) {
				frame.setExtendedState(Frame.ICONIFIED); // 如果点出了最小化按钮，则窗口最小化
			} else if (name.equals("exit")) {
				// System.exit(0); // 如果点击的是退出按钮则程序退出
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("min")) {
				lbl.setIcon(new ImageIcon("src/images/min_over.png")); // 鼠标经过最小化按钮
			} else if (name.equals("exit")) {
				lbl.setIcon(new ImageIcon("src/images/exit_over.png")); // 鼠标经过退出按钮
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("min")) {
				lbl.setIcon(new ImageIcon("src/images/min_def.png")); // 鼠标离开最小化按钮
			} else if (name.equals("exit")) {
				lbl.setIcon(new ImageIcon("src/images/exit_def.png")); // 鼠标离开退出按钮
			} 
		}
	}

}
