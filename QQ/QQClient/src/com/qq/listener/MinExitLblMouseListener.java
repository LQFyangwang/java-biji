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
				frame.setExtendedState(Frame.ICONIFIED); // ����������С����ť���򴰿���С��
			} else if (name.equals("exit")) {
				// System.exit(0); // �����������˳���ť������˳�
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
				lbl.setIcon(new ImageIcon("src/images/min_over.png")); // ��꾭����С����ť
			} else if (name.equals("exit")) {
				lbl.setIcon(new ImageIcon("src/images/exit_over.png")); // ��꾭���˳���ť
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
				lbl.setIcon(new ImageIcon("src/images/min_def.png")); // ����뿪��С����ť
			} else if (name.equals("exit")) {
				lbl.setIcon(new ImageIcon("src/images/exit_def.png")); // ����뿪�˳���ť
			} 
		}
	}

}
