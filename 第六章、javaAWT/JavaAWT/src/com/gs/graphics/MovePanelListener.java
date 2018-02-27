package com.gs.graphics;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MovePanelListener extends KeyAdapter {
	
	private MovePanel panel;
	
	public MovePanelListener(MovePanel panel) {
		this.panel = panel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP:
			System.out.println("up");
			panel.setY(-30);
			panel.repaint();
			panel.setDirection(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			panel.setY(30);
			panel.repaint();
			panel.setDirection(KeyEvent.VK_DOWN);
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			panel.setX(-30);
			panel.repaint();
			panel.setDirection(KeyEvent.VK_LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			panel.setX(30);
			panel.repaint();
			panel.setDirection(KeyEvent.VK_RIGHT);
			break;
			default:break;
		}
	}

}
