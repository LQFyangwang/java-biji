package com.gs.graphics;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChessPanel extends Panel implements MouseListener{

	private static final long serialVersionUID = -1705472872633893793L;
	
	private int x;
	private int y;
	
	public ChessPanel() {
		addMouseListener(this);
	}
	
	@Override 
	public void paint(Graphics g) {
		try {
			BufferedImage boardImg = ImageIO.read(new File("src/images/board.gif"));
			BufferedImage blackImg = ImageIO.read(new File("src/images/black.gif"));
			BufferedImage whiteImg = ImageIO.read(new File("src/images/white.gif"));
			g.drawImage(boardImg, 0, 0, null);
			g.drawImage(blackImg, 5, 5, null);
			g.drawImage(whiteImg, 25 + 5, 25 + 5, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 如果外观需要变化，则重写此方法 ，此方法 会被repaint()方法 自动调用
	 */
	@Override 
	public void update(Graphics g) {
		try {
			BufferedImage whiteImg = ImageIO.read(new File("src/images/white.gif"));
			g.drawImage(whiteImg, x, y, null);
		} catch (IOException ee) {
			ee.printStackTrace();
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
