 package com.gs.awt;

import java.awt.Frame;

public class FirstFrame2 extends Frame {

	private static final long serialVersionUID = -7190221901009802329L; // 序列化版本号

	public FirstFrame2() {
		setSize(400, 200); // 给自定义窗口设置大小
		// setLocation(300, 200); // 设置窗口的位置
		setLocationRelativeTo(null); // 设置一个相对位置（相对于某个组件的一个位置），相对于一个空组件，则居中
		setTitle("第一个窗口程序"); // 设置窗口的标题
		MyWindowListener1 ltn = new MyWindowListener1(this);
		addWindowListener(ltn); // 给当前窗口事件源对象添加一个窗口监听器（通常都是添加WindowListener接口的实现类对象）
		setVisible(true); // 设置窗口为可见的
	}
	
	public static void main(String[] args) {
		new FirstFrame2();
	}

}
