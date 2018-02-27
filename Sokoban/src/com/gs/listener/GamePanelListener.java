package com.gs.listener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import com.gs.common.Constants;
import com.gs.common.Map;
import com.gs.frame.GamePanel;

public class GamePanelListener extends KeyAdapter {
	
	private GamePanel gamePanel;
	
	private boolean onDesFlag = false; // ������־���Ƿ���Ŀ��λ����
	
	public GamePanelListener(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_UP) { // ����������ϼ�
			move(KeyEvent.VK_UP);
		} else if (keyCode == KeyEvent.VK_DOWN) { // ����������¼�
			move(KeyEvent.VK_DOWN);
		} else if (keyCode == KeyEvent.VK_LEFT) { // ������������
			move(KeyEvent.VK_LEFT);
		} else if (keyCode == KeyEvent.VK_RIGHT) { // ����������Ҽ�
			move(KeyEvent.VK_RIGHT);
		}
		
		
		if (win()) {
			int result = JOptionPane.showConfirmDialog(gamePanel, "��ϲ���أ��Ƿ������һ�أ�", "��ʾ", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				gamePanel.getMaps().clear();
				gamePanel.setLevel(gamePanel.getLevel() + 1);
				gamePanel.setMap(Map.getMap(gamePanel.getLevel()));
				gamePanel.repaint();
			}
		}
	}
	
	/**
	 * 1������˵�ǰһ���ǲݵأ�������ƶ�
	 * 2������˵�ǰһ�������������ӵ�ǰһ���ǲݵػ���Ŀ��λ�ã�������ƶ�
	 * 3������˵�ǰһ����Ŀ��������Ŀ�����ӵ�ǰһ���ǲݵػ���Ŀ��λ�ã�������ƶ�
	 * 4������˵�ǰһ����Ŀ��λ�ã�������ƶ�
	 * @param direction
	 */
	private void move(int direction) {
		int[][] map = gamePanel.getMap();
		int row = gamePanel.getCurrentRow();
		int col = gamePanel.getCurrentCol();
		int preRow = 0; // ����������ߣ����������ߣ���ʾ�˵���������������
		int preCol = 0; // ����������ߣ����������ߣ���ʾ�˵�������������
		int preRow1 = 0; // ����������ߣ����������ߣ���ʾ�˵������������������������
		int preCol1 = 0; // ����������ߣ����������ߣ���ʾ�˵����������������������
		int sprite = 0; // ������ʾ��Ҫ���ĸ������ϵ���
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
		
		if (map[preRow][preCol] == Constants.GRASS) { // 1������˵�ǰһ���ǲݵأ�������ƶ�
			gamePanel.getMaps().push(Map.copyMap(map));
			if (onDesFlag) { // �������Ŀ��λ����
				map[row][col] = Constants.DES; // �����Ƶ���һ��ԭ���˵�λ�û�Ŀ��λ��
			} else { // �˲���Ŀ��λ����
				map[row][col] = Constants.GRASS; // �����Ƶ���һ��ԭ���˵�λ�û��ݵ�
			}
			onDesFlag = false; // ���±���˲���Ŀ��λ����
			map[preRow][preCol] = sprite;//ǰһ��λ�û����ĸ������˵�ͼ
		} else if (map[preRow][preCol] == Constants.BOX 
				&& (map[preRow1][preCol1] == Constants.GRASS || map[preRow1][preCol1] == Constants.DES)) { 
			gamePanel.getMaps().push(Map.copyMap(map));
			// 2������˵�ǰһ�������������ӵ�ǰһ���ǲݵػ���Ŀ��λ�ã�������ƶ�
			if (onDesFlag) { // �������Ŀ��λ����
				map[row][col] = Constants.DES; // �����Ƶ���һ��ԭ���˵�λ�û�Ŀ��λ��
			} else { // �˲���Ŀ��λ����
				map[row][col] = Constants.GRASS; // �����Ƶ���һ��ԭ���˵�λ�û��ݵ�
			}
			onDesFlag = false; // ���±���˲���Ŀ��λ����
			map[preRow][preCol] = sprite;
			if (map[preRow1][preCol1] == Constants.GRASS) {
				map[preRow1][preCol1] = Constants.BOX;
			} else if (map[preRow1][preCol1] == Constants.DES) {
				map[preRow1][preCol1] = Constants.BOX_DES;
			}
		} else if (map[preRow][preCol] == Constants.BOX_DES
				&& (map[preRow1][preCol1] == Constants.GRASS || map[preRow1][preCol1] == Constants.DES)) { // 3������˵�ǰһ����Ŀ��������Ŀ�����ӵ�ǰһ���ǲݵػ���Ŀ��λ�ã�������ƶ�
			gamePanel.getMaps().push(Map.copyMap(map));
			if (onDesFlag) { // �������Ŀ��λ����
				map[row][col] = Constants.DES; // �����Ƶ���һ��ԭ���˵�λ�û�Ŀ��λ��
			} else { // �˲���Ŀ��λ����
				map[row][col] = Constants.GRASS; // �����Ƶ���һ��ԭ���˵�λ�û��ݵ�
			}
			onDesFlag = false; // ���±���˲���Ŀ��λ����
			map[preRow][preCol] = sprite;
			onDesFlag = true; // ��Ϊ�˵���һ����Ŀ�����ӣ���������һ���ߺ�����Ȼ��Ŀ��λ����
			if (map[preRow1][preCol1] == Constants.GRASS) {
				map[preRow1][preCol1] = Constants.BOX;
			} else if (map[preRow1][preCol1] == Constants.DES) {
				map[preRow1][preCol1] = Constants.BOX_DES;
			}
		} else if (map[preRow][preCol] == Constants.DES) { // 4������˵�ǰһ����Ŀ��λ�ã�������ƶ�
			gamePanel.getMaps().push(Map.copyMap(map));
			if (onDesFlag) { // �������Ŀ��λ����
				map[row][col] = Constants.DES; // �����Ƶ���һ��ԭ���˵�λ�û�Ŀ��λ��
			} else { // �˲���Ŀ��λ����
				map[row][col] = Constants.GRASS; // �����Ƶ���һ��ԭ���˵�λ�û��ݵ�
			}
			onDesFlag = false; // ���±���˲���Ŀ��λ����
			map[preRow][preCol] = sprite; // ԭ�ȴ�λ����Ŀ��λ��
			onDesFlag = true; // ��Ϊ�˵���һ����Ŀ�����ӣ���������һ���ߺ�����Ȼ��Ŀ��λ����
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
