package com.gs.graphics;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ChessGame1 extends Frame {

	private static final long serialVersionUID = -8899539102839021618L;

	public ChessGame1() {
		setSize(450, 470);
		setTitle("Îå×ÓÆå");
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		add(new ChessPanel());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ChessGame1.this.dispose();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChessGame1();
			}
			
		});
	}

}
