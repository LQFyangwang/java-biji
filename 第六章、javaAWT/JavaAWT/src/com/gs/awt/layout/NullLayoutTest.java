package com.gs.awt.layout;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.SwingUtilities;

import com.gs.listener.FrameListener;

public class NullLayoutTest extends Frame {

	private static final long serialVersionUID = 1477801342512324993L;
	
	public NullLayoutTest() {
		setSize(460, 460);
		setTitle("∆Â≈Ã");
		setLayout(null);
		setLocationRelativeTo(null);
		initWidgets();
		FrameListener ltn = new FrameListener(this);
		addWindowListener(ltn);
		setVisible(true);
	}
	
	private void initWidgets() {
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				Button btn = new Button();
				btn.setBounds(col * 40 + 30, row * 40 + 40, 40, 40);
				add(btn);
			}
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new NullLayoutTest();
			}
			
		});
	}

}
