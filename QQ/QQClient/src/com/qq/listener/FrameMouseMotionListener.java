package com.qq.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//�϶�
public class FrameMouseMotionListener implements MouseListener, MouseMotionListener {
	
	private JFrame frame;
	private int lastX; // �϶�ǰ����һ��x
	private int lastY; // ��һ�ε�y

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int xOnScreen = e.getXOnScreen(); // ��ȡ�ؼ�����Ļ�ϵ�x����
		int yOnScreen = e.getYOnScreen(); // ��ȡ�ؼ�����Ļ�ϵ�y����
	
		int left = xOnScreen - lastX; // �϶�ʱ��x-��һ��x��x��λ����
		int top = yOnScreen - lastY; // �϶�ʱ��y - ��һ��y, y��λ����
	
		frame.setLocation(frame.getX() + left, frame.getY() + top);
		lastX = xOnScreen; // ���϶�����x��ֵ����һ�ε�x
		lastY = yOnScreen; // ���϶�����y��ֵ����һ�ε�y
	} 

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		lastX = e.getXOnScreen(); // һ���ʱ����Ļ�ϵ�x����
		lastY = e.getYOnScreen(); // һ���ʱ����Ļ�ϵ�y����
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
