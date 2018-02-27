package com.gs.graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class GraphicsTest extends JFrame {

	private static final long serialVersionUID = 235381427367234828L;
	
	public GraphicsTest() {
		setSize(400, 400);
		setTitle("»æÍ¼");
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(30, 30, 200, 200);
	}
	
	@Override
	public void repaint() {
		//
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GraphicsTest();
			}
		});
	}
	

}
