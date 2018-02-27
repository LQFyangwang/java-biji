package com.gs.frame;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import com.gs.common.Constants;
import com.gs.listener.GameBtnListener;
import com.gs.listener.GameCBListener;

public class OptionPanel extends JPanel {

	private static final long serialVersionUID = 3558275951422784424L;
	
	private GameBtnListener gameBtnListener;
	private GameCBListener gameCBListener;
	
	public OptionPanel(GameBtnListener gameBtnListener, GameCBListener gameCBListener) {
		this.gameBtnListener = gameBtnListener;
		this.gameCBListener = gameCBListener;
		setPreferredSize(new Dimension(Constants.FRAME_WIDTH - Constants.GAME_PANEL_WIDTH, Constants.GAME_PANEL_HEIGHT));
		setLayout(new GridLayout(12, 1, 0, 10));
		initWidgets();
	}
	
	private void initWidgets() {
		JButton replayBtn = new JButton("重来");
		replayBtn.setActionCommand(Constants.BTN_REPLAY);
		replayBtn.addActionListener(gameBtnListener);
		add(replayBtn);
		JButton preStepBtn = new JButton("上一步");
		preStepBtn.setActionCommand(Constants.BTN_PRESTEP);
		preStepBtn.addActionListener(gameBtnListener);
		add(preStepBtn);
		JButton firstBtn = new JButton("第一关");
		firstBtn.setActionCommand(Constants.BTN_FIRST);
		firstBtn.addActionListener(gameBtnListener);
		add(firstBtn);
		JButton preBtn = new JButton("上一关");
		preBtn.setActionCommand(Constants.BTN_PRE);
		preBtn.addActionListener(gameBtnListener);
		add(preBtn);
		JButton nextBtn = new JButton("下一关");
		nextBtn.setActionCommand(Constants.BTN_NEXT);
		nextBtn.addActionListener(gameBtnListener);
		add(nextBtn);
		JButton lastBtn = new JButton("最后一关");
		lastBtn.setActionCommand(Constants.BTN_LAST);
		lastBtn.addActionListener(gameBtnListener);
		add(lastBtn);
		JComboBox<String> chooseCB = new JComboBox<String>();
		chooseCB.setActionCommand("choose");
		for (int i = 0, len = Constants.CHOOSE_LEVEL.length; i < len; i++) {
			chooseCB.addItem(Constants.CHOOSE_LEVEL[i]);
		}
		chooseCB.addItemListener(gameCBListener);
		add(chooseCB);
		JComboBox<String> musicCB = new JComboBox<String>();
		musicCB.addItem("停止播放");
		for (int i = 0, len = Constants.MUSICS.length; i < len; i++) {
			musicCB.addItem(Constants.MUSICS[i]);
		}
		musicCB.setActionCommand("music");
		musicCB.addItemListener(gameCBListener);
		add(musicCB);
		JButton aboutBtn = new JButton("关于");
		aboutBtn.setActionCommand(Constants.BTN_ABOUT);
		aboutBtn.addActionListener(gameBtnListener);
		add(aboutBtn);
	}

}
