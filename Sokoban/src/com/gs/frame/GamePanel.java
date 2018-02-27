package com.gs.frame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Stack;

import javax.swing.JPanel;

import com.gs.common.Constants;
import com.gs.common.ImageUtil;
import com.gs.listener.GamePanelListener;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = -825518767485784990L;
	
	private int level = 1;
	private int[][] map;
	private Stack<int[][]> maps;
	/**
	 * Stack ���ʾ����ȳ���LIFO���Ķ����ջ����ͨ������������� Vector ��������չ ��
	 * ����������Ϊ��ջ�����ṩ��ͨ���� push �� pop �������Լ�ȡ��ջ����� peek ������
	 * ���Զ�ջ�Ƿ�Ϊ�յ� empty �������ڶ�ջ�в����ȷ������ջ������� search ������
	 */
	private int currentRow;
	private int currentCol;
	
	public GamePanel() {
		setPreferredSize(new Dimension());
		maps = new Stack<int[][]>();
		addKeyListener(new GamePanelListener(this));
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentCol() {
		return currentCol;
	}

	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	public Stack<int[][]> getMaps() {
		return maps;
	}

	public void setMaps(Stack<int[][]> maps) {
		this.maps = maps;
	}

	@Override 
	public void paint(Graphics g) {
		
		if (map != null) {
			for (int row = 0; row < Constants.ROWS; row++) {
				for (int col = 0; col < Constants.COLS; col++) {
					int idx = map[row][col];
					if (idx == Constants.UP || idx == Constants.DOWN || idx == Constants.LEFT || idx == Constants.RIGHT) {
						currentRow = row;
						currentCol = col;
					}
					BufferedImage img = ImageUtil.readImage(Constants.IMAGES[idx]);
					int x = col * Constants.IMAGE_WIDTH;
					int y = row * Constants.IMAGE_HEIGHT;
					g.drawImage(img, x, y, null);
				}
			}
		}
		focus();
	}
	
	public void focus() {
		setFocusable(true);
		requestFocus();
	}

}
