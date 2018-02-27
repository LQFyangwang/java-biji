package com.gs.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 用一个单独的类来实现监听器接口
 * 如果在这个类里面需要对窗口进行操作，则需要把窗口对象传递给本类
 *
 */
public class MyWindowListener1 implements WindowListener {
	
	private Frame frame; // 当前监听器的一个Frame成员变量
	
	public MyWindowListener1(Frame frame) {
		this.frame = frame;
	}
	
	/**
	 * 窗口已经打开事件
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("窗口已经打开");
	}

	/**
	 * 窗口正在关闭的事件
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("window closing");
		frame.dispose();
	}

	/**
	 * 窗口已经关闭的事件
	 */
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window closed");
	}

	/**
	 * 窗口的最小化事件
	 */
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 由窗口最小化状态变为可见状态的事件
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 窗口已可见，成为顶层窗口
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 非激活状态
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}