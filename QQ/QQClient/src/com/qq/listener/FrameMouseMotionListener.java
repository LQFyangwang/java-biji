package com.qq.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//拖动
public class FrameMouseMotionListener implements MouseListener, MouseMotionListener {
	
	private JFrame frame;
	private int lastX; // 拖动前的上一次x
	private int lastY; // 上一次的y

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int xOnScreen = e.getXOnScreen(); // 获取控件在屏幕上的x坐标
		int yOnScreen = e.getYOnScreen(); // 获取控件在屏幕上的y坐标
	
		int left = xOnScreen - lastX; // 拖动时的x-上一次x，x的位移量
		int top = yOnScreen - lastY; // 拖动时的y - 上一次y, y的位移量
	
		frame.setLocation(frame.getX() + left, frame.getY() + top);
		lastX = xOnScreen; // 把拖动完后的x赋值给上一次的x
		lastY = yOnScreen; // 把拖动完后的y赋值给上一次的y
	} 

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		lastX = e.getXOnScreen(); // 一点击时的屏幕上的x坐标
		lastY = e.getYOnScreen(); // 一点击时的屏幕上的y坐标
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
