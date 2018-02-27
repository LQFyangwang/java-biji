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
		setTitle("�߿򲼾�");
		setLocationRelativeTo(null);
		FrameListener ltn = new FrameListener(this);
		addWindowListener(ltn);
		setLayout(new BorderLayout());
		initWidgets();
		setVisible(true);
	}
	
	private void initWidgets() {
		Button btn1 = new Button("��");
		btn1.setPreferredSize(new Dimension(5, 100)); // �ɵ���setPreferredSize()���趨��Ҫ�ĸ߶� 
		add(btn1, BorderLayout.NORTH);
		Button btn2 = new Button("��");
		add(btn2, BorderLayout.SOUTH);
		Button btn3 = new Button("��");
		add(btn3, BorderLayout.WEST);
		Button btn4 = new Button("��");
		add(btn4, BorderLayout.EAST);
		Button btn5 = new Button("��");
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
