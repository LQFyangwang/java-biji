package com.gs.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.gs.common.Constants;

public class TopPanel extends JPanel {

	private static final long serialVersionUID = -3687542661586558432L;
	
	public static final int PANEL_HEIGHT = 60;

	public TopPanel() {
		setPreferredSize(new Dimension(Constants.FRAME_WIDTH, PANEL_HEIGHT));
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(0, 0, Constants.FRAME_WIDTH, PANEL_HEIGHT);
		g.setColor(Color.RED);
		g.setFont(new Font("ºÚÌå", Font.BOLD, 30));
		g.drawString("ÍÆÏä×Ó", 300, 40);
	}
	
}
