package com.gs.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstFrame extends Frame implements WindowListener {

	private static final long serialVersionUID = -7190221901009802329L; // 序列化版本号

	public FirstFrame() {
		setSize(400, 200); // 给自定义窗口设置大小
		// setLocation(300, 200); // 设置窗口的位置
		setLocationRelativeTo(null); // 设置一个相对位置（相对于某个组件的一个位置），相对于一个空组件，则居中
		setTitle("第一个窗口程序"); // 设置窗口的标题
		addWindowListener(this); 
		// 给当前窗口事件源对象添加一个窗口监听器（通常都是添加WindowListener接口的实现类对象）
		setVisible(true); // 设置窗口为可见的
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
		this.dispose(); // 表示把窗口界面从屏幕清除掉
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
	
	public static void main(String[] args) {
		new FirstFrame();
	}

}
