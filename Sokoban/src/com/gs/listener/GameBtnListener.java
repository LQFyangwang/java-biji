package com.gs.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JOptionPane;

import com.gs.common.Constants;
import com.gs.common.Map;
import com.gs.frame.GamePanel;

public class GameBtnListener implements ActionListener {

	private GamePanel gamePanel;
	
	public GameBtnListener(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals(Constants.BTN_REPLAY)) {
			Stack<int[][]> maps = gamePanel.getMaps();
			if(!maps.isEmpty()){
				gamePanel.setMap(maps.get(0));
				maps.clear(); // ��ջ���������
			}else {
				JOptionPane.showMessageDialog(gamePanel, "��δ�ƶ�");
			}
			gamePanel.repaint();
		} else if (actionCommand.equals(Constants.BTN_PRESTEP)) {
			Stack<int[][]> maps = gamePanel.getMaps();
			if (maps.empty()) { // �ж�ջ���Ƿ�������
				JOptionPane.showMessageDialog(gamePanel, "�Ѿ�û����һ����", "��ʾ", JOptionPane.WARNING_MESSAGE);
			} else {
				gamePanel.setMap(maps.pop());
			}
			gamePanel.repaint();
		} else if (actionCommand.equals(Constants.BTN_FIRST)) {
			Map.copyOMap(gamePanel);
			gamePanel.setLevel(1);
			gamePanel.setMap(Map.getMap(1));
			gamePanel.repaint();
			gamePanel.getMaps().clear();
		} else if (actionCommand.equals(Constants.BTN_PRE)) {
			Map.copyOMap(gamePanel);
			int currentLevel = gamePanel.getLevel();
			if (currentLevel == 1) {
				JOptionPane.showMessageDialog(gamePanel, "�Ѿ��ǵ�һ��", "��ʾ", JOptionPane.WARNING_MESSAGE);
			} else {
				gamePanel.setLevel(currentLevel - 1);
				gamePanel.setMap(Map.getMap(currentLevel - 1));
				gamePanel.repaint();
			}
			gamePanel.getMaps().clear();
		} else if (actionCommand.equals(Constants.BTN_NEXT)) {
			Map.copyOMap(gamePanel);
			int currentLevel = gamePanel.getLevel();
			if (currentLevel == 11) {
				JOptionPane.showMessageDialog(gamePanel, "�Ѿ������һ��", "��ʾ", JOptionPane.WARNING_MESSAGE);
			} else {
				gamePanel.setLevel(currentLevel + 1);
				gamePanel.setMap(Map.getMap(currentLevel + 1));
				gamePanel.repaint();
			}
			gamePanel.getMaps().clear();
		} else if (actionCommand.equals(Constants.BTN_LAST)) {
			Map.copyOMap(gamePanel);
			gamePanel.setLevel(11);
			gamePanel.setMap(Map.getMap(11));
			gamePanel.repaint();
			gamePanel.getMaps().clear();
		} else if (actionCommand.equals(Constants.BTN_ABOUT)) {
			JOptionPane.showMessageDialog(gamePanel, "***�����ӣ�V1.0��", "����", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
