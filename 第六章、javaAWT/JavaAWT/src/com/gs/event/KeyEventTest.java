package com.gs.event;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class KeyEventTest extends Frame implements KeyListener {

	private static final long serialVersionUID = 3440640976172182452L;

	public KeyEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		TextField txt = new TextField();
		txt.addKeyListener(this);
		add(txt);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				KeyEventTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("released");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new KeyEventTest();
			}
			
		});
	}

}
