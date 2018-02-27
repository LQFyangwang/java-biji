package com.gs.event;

import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ComponentEventTest extends Frame implements ComponentListener {

	private static final long serialVersionUID = -5409979347922707871L;
	
	public ComponentEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		addComponentListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ComponentEventTest.this.dispose();
			}
		});
		setVisible(true);
	}

	/**
	 * 监听组件的大小变化
	 */
	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("大小改变了");
		Object obj = e.getSource();  // 获取事件源对象
		int id = e.getID(); // 获取事件编号
		if (obj instanceof Frame) {
			System.out.println("此组件是一个frame");
		}
		System.out.println(id);
	}

	/**
	 * 监听组件的移动 
	 */
	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("移动了");
	}

	/**
	 * 监听组件的显示
	 */
	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("已显示");
	}

	/**
	 * 监听组件的隐藏
	 */
	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("已隐藏");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ComponentEventTest();
			}
			
		});
	}
	
	

}
