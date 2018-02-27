package com.gs.graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class PaintFrame extends Frame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 7221411904732764394L;
	
	private int x;
	private int y;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public PaintFrame() {
		setSize(600, 600);
		setTitle("Í¿Ñ»°å");
		setLocationRelativeTo(null);
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				PaintFrame.this.dispose();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new PaintFrame();
			}
			
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawLine(x, y, x + 5, y + 5);
		// g.drawLine(x1, y1, x2, y2);
	}
	
	@Override 
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.x1 = e.getX();
		this.y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.x2 = e.getX();
		this.y2 = e.getY();
		repaint();
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
