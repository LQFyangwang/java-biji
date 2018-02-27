package com.gs.awt.layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.SwingUtilities;

import com.gs.listener.FrameListener;

public class GridLayoutTest extends Frame {

	private static final long serialVersionUID = 6220388549636243794L;
	
	public GridLayoutTest() {
		setSize(400, 400);
		setTitle("���񲼾�");
		setLocationRelativeTo(null);
		FrameListener ltn = new FrameListener(this);
		addWindowListener(ltn);
		setLayout(new GridLayout(3, 4)); // ָ��3��4�е����񲼾�
		initWidgets();
		setVisible(true);
	}
	
	private void initWidgets() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				Button btn = new Button("��" + row + "��" + col);
				add(btn);
			}
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GridLayoutTest();
			}
		});
	}

}
