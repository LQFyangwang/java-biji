package com.gs.graphics;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MovePanel extends Panel {

	private static final long serialVersionUID = 3613894436083253029L;
	
	private int currentX = 90;
	private int currentY = 90;
	private int direction = KeyEvent.VK_RIGHT;
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public MovePanel() {
		setSize(300, 300);
		addKeyListener(new MovePanelListener(this));
		setFocusable(true); // �����ÿ��Ի�ȡ������
		requestFocus(); // ��ȡ����
	}
	
	@Override
	public void paint(Graphics g) {
		try {
			BufferedImage img = ImageIO.read(new File("src/images/grass.gif"));
			for (int row = 0; row < 10; row++) {
				for (int col = 0; col < 10; col++) {
					g.drawImage(img, col * 30, row * 30, null);
				}
			}
			BufferedImage img1 = null;
			String imgSrc = null;
			switch (direction) {
			case KeyEvent.VK_RIGHT:
				imgSrc = "right.gif";
				break;
			case KeyEvent.VK_DOWN:
				imgSrc = "down.gif";
				break;
			case KeyEvent.VK_LEFT:
				imgSrc = "left.gif";
				break;
			case KeyEvent.VK_UP:
				imgSrc = "up.gif";
				break;
			}
			img1 = ImageIO.read(new File("src/images/" + imgSrc));
			currentX += x;
			currentY += y;
			g.drawImage(img1, currentX, currentY, null);
			x = 0;
			y = 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(Graphics g) {
		paint(g); // ����Ҫ���»����ʱ��ֱ�ӵ���paint������������ͼ��ȫ�����»�����
	}
	
}
