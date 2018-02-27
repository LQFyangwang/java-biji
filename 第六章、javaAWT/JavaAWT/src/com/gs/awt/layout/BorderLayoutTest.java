package com.gs.awt.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.SwingUtilities;

import com.gs.listener.FrameListener;

public class BorderLayoutTest extends Frame {

	private static final long serialVersionUID = 9214717915722039848L;
	
	public BorderLayoutTest() {
		setSize(400, 400);
		setTitle("边框布局");
		setLocationRelativeTo(null);
		FrameListener ltn = new FrameListener(this);
		addWindowListener(ltn);
		setLayout(new BorderLayout());
		initWidgets();
		setVisible(true);
	}
	
	private void initWidgets() {
		Button btn1 = new Button("北");
		btn1.setPreferredSize(new Dimension(5, 100)); // 可调用setPreferredSize()来设定想要的高度 
		add(btn1, BorderLayout.NORTH);
		Button btn2 = new Button("南");
		add(btn2, BorderLayout.SOUTH);
		Button btn3 = new Button("西");
		add(btn3, BorderLayout.WEST);
		Button btn4 = new Button("东");
		add(btn4, BorderLayout.EAST);
		Button btn5 = new Button("中");
		add(btn5, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new BorderLayoutTest();
			}
		});
	}

}
