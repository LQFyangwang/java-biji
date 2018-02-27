package com.gs.event;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ContainerEventTest extends Frame implements ContainerListener {

	private static final long serialVersionUID = -5065093428187054524L;

	public ContainerEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		addContainerListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ContainerEventTest.this.dispose();
			}
		});
		add(new Button("按钮"));
		Button btn = new Button("按钮1");
		add(btn); // 把组件添加的容器
		remove(btn); // 从容器移除组件
		setVisible(true);
	}
	
	/**
	 * 监听组件的添加 
	 */
	@Override
	public void componentAdded(ContainerEvent e) {
		System.out.println("添加了一个组件");
		@SuppressWarnings("unused")//警告，未使用
		Object obj = e.getSource(); // 获取事件源，在这里就是一个Frame
		Component c = e.getChild(); // 获取是什么组件添加到容器中了
		if (c instanceof Button) {
			System.out.println("添加了一个按钮");
		}
	}

	/**
	 * 监听组件的移除
	 */
	@Override
	public void componentRemoved(ContainerEvent e) {
		System.out.println("移除了一个组件");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ContainerEventTest();
			}
			
		});
	}

}
