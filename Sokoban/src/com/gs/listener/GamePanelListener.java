package com.gs.listener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import com.gs.common.Constants;
import com.gs.common.Map;
import com.gs.frame.GamePanel;

public class GamePanelListener extends KeyAdapter {
	
	private GamePanel gamePanel;
	
	private boolean onDesFlag = false; // 用来标志人是否在目标位置上
	
	public GamePanelListener(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_UP) { // 如果按的向上键
			move(KeyEvent.VK_UP);
		} else if (keyCode == KeyEvent.VK_DOWN) { // 如果按的向下键
			move(KeyEvent.VK_DOWN);
		} else if (keyCode == KeyEvent.VK_LEFT) { // 如果按的向左键
			move(KeyEvent.VK_LEFT);
		} else if (keyCode == KeyEvent.VK_RIGHT) { // 如果按的向右键
			move(KeyEvent.VK_RIGHT);
		}
		
		
		if (win()) {
			int result = JOptionPane.showConfirmDialog(gamePanel, "恭喜过关，是否进入下一关？", "提示", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				gamePanel.getMaps().clear();
				gamePanel.setLevel(gamePanel.getLevel() + 1);
				gamePanel.setMap(Map.getMap(gamePanel.getLevel()));
				gamePanel.repaint();
			}
		}
	}
	
	/**
	 * 1、如果人的前一格是草地，则可以移动
	 * 2、如果人的前一格是箱子且箱子的前一格是草地或者目标位置，则可以移动
	 * 3、如果人的前一格是目标箱子且目标箱子的前一格是草地或者目标位置，则可以移动
	 * 4、如果人的前一格是目标位置，则可以移动
	 * @param direction
	 */
	private void move(int direction) {
		int[][] map = gamePanel.getMap();
		int row = gamePanel.getCurrentRow();
		int col = gamePanel.getCurrentCol();
		int preRow = 0; // 如果人向上走，或者向下走，表示人的上面或者下面的行
		int preCol = 0; // 如果人向左走，或者向右走，表示人的左面或右面的列
		int preRow1 = 0; // 如果人向上走，或者向下走，表示人的上面的上面或者下面的下面行
		int preCol1 = 0; // 如果人向左走，或者向右走，表示人的左面的左面或右面的右面列
		int sprite = 0; // 用来表示需要画哪个方向上的人
		if (direction == KeyEvent.VK_UP) {
			preRow = row - 1;
			preRow1 = row - 2;
			preCol = col;
			preCol1 = col;
			sprite = Constants.UP;
		} else if (direction == KeyEvent.VK_DOWN) {
			preRow = row + 1;
			preRow1 = row + 2;
			preCol = col;
			preCol1 = col;
			sprite = Constants.DOWN;
		} else if (direction == KeyEvent.VK_LEFT) {
			preRow = row;
			preRow1 = row;
			preCol = col - 1;
			preCol1 = col - 2;
			sprite = Constants.LEFT;
		} else if (direction == KeyEvent.VK_RIGHT) {
			preRow = row;
			preRow1 = row;
			preCol = col + 1;
			preCol1 = col + 2;
			sprite = Constants.RIGHT;
		}
		
		if (map[preRow][preCol] == Constants.GRASS) { // 1、如果人的前一格是草地，则可以移动
			gamePanel.getMaps().push(Map.copyMap(map));
			if (onDesFlag) { // 如果人在目标位置上
				map[row][col] = Constants.DES; // 则当人移到下一格，原先人的位置画目标位置
			} else { // 人不在目标位置上
				map[row][col] = Constants.GRASS; // 则不人移到下一格，原先人的位置画草地
			}
			onDesFlag = false; // 重新标记人不在目标位置上
			map[preRow][preCol] = sprite;//前一个位置画是哪个方向人的图
		} else if (map[preRow][preCol] == Constants.BOX 
				&& (map[preRow1][preCol1] == Constants.GRASS || map[preRow1][preCol1] == Constants.DES)) { 
			gamePanel.getMaps().push(Map.copyMap(map));
			// 2、如果人的前一格是箱子且箱子的前一格是草地或者目标位置，则可以移动
			if (onDesFlag) { // 如果人在目标位置上
				map[row][col] = Constants.DES; // 则当人移到下一格，原先人的位置画目标位置
			} else { // 人不在目标位置上
				map[row][col] = Constants.GRASS; // 则不人移到下一格，原先人的位置画草地
			}
			onDesFlag = false; // 重新标记人不在目标位置上
			map[preRow][preCol] = sprite;
			if (map[preRow1][preCol1] == Constants.GRASS) {
				map[preRow1][preCol1] = Constants.BOX;
			} else if (map[preRow1][preCol1] == Constants.DES) {
				map[preRow1][preCol1] = Constants.BOX_DES;
			}
		} else if (map[preRow][preCol] == Constants.BOX_DES
				&& (map[preRow1][preCol1] == Constants.GRASS || map[preRow1][preCol1] == Constants.DES)) { // 3、如果人的前一格是目标箱子且目标箱子的前一格是草地或者目标位置，则可以移动
			gamePanel.getMaps().push(Map.copyMap(map));
			if (onDesFlag) { // 如果人在目标位置上
				map[row][col] = Constants.DES; // 则当人移到下一格，原先人的位置画目标位置
			} else { // 人不在目标位置上
				map[row][col] = Constants.GRASS; // 则不人移到下一格，原先人的位置画草地
			}
			onDesFlag = false; // 重新标记人不在目标位置上
			map[preRow][preCol] = sprite;
			onDesFlag = true; // 因为人的下一格是目标箱子，则人往下一格走后，人依然在目标位置上
			if (map[preRow1][preCol1] == Constants.GRASS) {
				map[preRow1][preCol1] = Constants.BOX;
			} else if (map[preRow1][preCol1] == Constants.DES) {
				map[preRow1][preCol1] = Constants.BOX_DES;
			}
		} else if (map[preRow][preCol] == Constants.DES) { // 4、如果人的前一格是目标位置，则可以移动
			gamePanel.getMaps().push(Map.copyMap(map));
			if (onDesFlag) { // 如果人在目标位置上
				map[row][col] = Constants.DES; // 则当人移到下一格，原先人的位置画目标位置
			} else { // 人不在目标位置上
				map[row][col] = Constants.GRASS; // 则不人移到下一格，原先人的位置画草地
			}
			onDesFlag = false; // 重新标记人不在目标位置上
			map[preRow][preCol] = sprite; // 原先此位置是目标位置
			onDesFlag = true; // 因为人的下一格是目标箱子，则人往下一格走后，人依然在目标位置上
		}
		gamePanel.repaint();
	}
	
	private boolean win() {
		int[][] map = Map.getMap(gamePanel.getLevel());
		for (int row = 0; row < Constants.ROWS; row++) {
			for (int col = 0; col < Constants.COLS; col++) {
				if (map[row][col] == Constants.BOX) {
					return false;
				}
			}
		}
		return true;
	}
	
}
