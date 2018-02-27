package com.gs.awt.layout;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;

import javax.swing.SwingUtilities;

import com.gs.listener.FrameListener;

public class CardLayoutTest extends Frame {

	private static final long serialVersionUID = 4286845386476377538L;

	public CardLayoutTest() {
		setSize(400, 400);
		setTitle("��Ƭ����");
		setLocationRelativeTo(null);
		
		setLayout(new CardLayout());
		initWidgets();
		FrameListener ltn = new FrameListener(this);
		addWindowListener(ltn);
		setVisible(true);
	}
	
	private void initWidgets() {
		Button btn = new Button("��ť1");
		Button btn1 = new Button("��ť2");
		add(btn);
		add(btn1);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CardLayoutTest();
			}
			
		});
	}

}
