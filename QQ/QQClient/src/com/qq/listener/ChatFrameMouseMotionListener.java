package com.qq.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JWindow;

public class ChatFrameMouseMotionListener implements MouseListener, MouseMotionListener {

	private JWindow window;
	
	public ChatFrameMouseMotionListener(JWindow window) {
		this.window = window;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// ���϶���ʱ�򣬱����dispose
		window.dispose();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// �����������������λ��ʱ�������dispose
		window.dispose();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
