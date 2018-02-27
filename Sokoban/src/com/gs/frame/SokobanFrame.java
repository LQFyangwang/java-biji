package com.gs.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.gs.common.Constants;
import com.gs.common.Map;
import com.gs.listener.GameBtnListener;
import com.gs.listener.GameCBListener;

public class SokobanFrame extends JFrame {
	
	private static final long serialVersionUID = -4805571494112824863L;
	
	public SokobanFrame() {
		setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIHGT);
		setTitle("ÍÆÏä×Ó");
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(new BorderLayout());
		initWidgets();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void initWidgets() {
		TopPanel topPanel = new TopPanel();
		add(topPanel, BorderLayout.NORTH);
		GamePanel gamePanel = new GamePanel();
		gamePanel.setMap(Map.getMap(1));
		add(gamePanel, BorderLayout.CENTER);
		OptionPanel optionPanel = new OptionPanel(new GameBtnListener(gamePanel), new GameCBListener(gamePanel));
		add(optionPanel, BorderLayout.EAST);
	}
}
