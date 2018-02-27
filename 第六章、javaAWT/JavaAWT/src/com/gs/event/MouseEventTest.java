package com.gs.event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class MouseEventTest extends Frame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = -3452827393753959352L;

	public MouseEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MouseEventTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicked");
		int x = e.getX();
		int y = e.getY();
		System.out.println("µã»÷µÄÎ»ÖÃ£º(" + x + ", " + y + ")");
		int count = e.getClickCount();
		if (count == 1) {
			System.out.println("µ¥»÷");
		} else if (count == 2) {
			System.out.println("Ë«»÷");
		}
		int btn = e.getButton();
		if (btn == MouseEvent.BUTTON1) {
			System.out.println("×ó¼ü");
		} else if (btn == MouseEvent.BUTTON2) {
			System.out.println("¹öÂÖ");
		} else if (btn == MouseEvent.BUTTON3) {
			System.out.println("ÓÒ¼ü");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse dragged...");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse moved...");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MouseEventTest();
			}
			
		});
	}

}
