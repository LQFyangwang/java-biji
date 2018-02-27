package com.gs.graphics;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class ChessGame extends Frame implements MouseListener {

	private static final long serialVersionUID = 720388598269179330L;
	
	private int x;
	private int y;
	
	public ChessGame() {
		setSize(450, 470);
		setTitle("五子棋");
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ChessGame.this.dispose();
			}
		});
		setVisible(true);
	}
	
	@Override 
	public void paint(Graphics g) {
		try {
			BufferedImage boardImg = ImageIO.read(new File("src/images/board.gif"));
			BufferedImage blackImg = ImageIO.read(new File("src/images/black.gif"));
			BufferedImage whiteImg = ImageIO.read(new File("src/images/white.gif"));
			g.drawImage(boardImg, 10, 30, null);
			g.drawImage(blackImg, 10 + 5, 30 + 5, null);
			g.drawImage(whiteImg, 10 + 25 + 5, 30 + 25 + 5, null);
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
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChessGame();
			}
			
		});
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
