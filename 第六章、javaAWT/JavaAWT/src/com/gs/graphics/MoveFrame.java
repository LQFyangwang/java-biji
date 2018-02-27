package com.gs.graphics;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class MoveFrame extends Frame {

	private static final long serialVersionUID = 5674844817309003776L;
	
	public MoveFrame() {
		setSize(450, 470);
		setTitle("ÒÆ¶¯");
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		add(new MovePanel());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MoveFrame.this.dispose();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MoveFrame();
			}
			
		});
	}

}
