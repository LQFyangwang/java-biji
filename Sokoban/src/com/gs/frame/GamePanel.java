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
	 * Stack 类表示后进先出（LIFO）的对象堆栈。它通过五个操作对类 Vector 进行了扩展 ，
	 * 允许将向量视为堆栈。它提供了通常的 push 和 pop 操作，以及取堆栈顶点的 peek 方法、
	 * 测试堆栈是否为空的 empty 方法、在堆栈中查找项并确定到堆栈顶距离的 search 方法。
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
