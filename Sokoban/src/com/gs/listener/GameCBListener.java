package com.gs.listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.gs.common.Constants;
import com.gs.common.Map;
import com.gs.common.MusicUtil;
import com.gs.frame.GamePanel;

public class GameCBListener implements ItemListener {
	
	private GamePanel gamePanel;
	private MusicUtil mu;
	
	public GameCBListener(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
		this.mu = new MusicUtil();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox<String> cb = (JComboBox<String>) e.getSource();
		String command = cb.getActionCommand();
		String item = (String) cb.getSelectedItem();
		if (command.equals("choose")) {
			for (int i = 0, len = Constants.CHOOSE_LEVEL.length; i < len; i++) {
				if (item.equals(Constants.CHOOSE_LEVEL[i])) {
					gamePanel.setLevel(i + 1);
					gamePanel.setMap(Map.getMap(i + 1));
					gamePanel.repaint();
					break;
				}
			}
		} else if (command.equals("music")) {
			if (item.equals("Í£Ö¹²¥·Å")) {
				mu.stop();
			} else {
				mu.play("src/musics/" + item);
			}
			gamePanel.focus();
		}
	}

}
