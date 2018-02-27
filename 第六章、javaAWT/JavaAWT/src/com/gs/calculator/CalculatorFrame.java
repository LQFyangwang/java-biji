package com.gs.calculator;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorFrame extends Frame {

	private static final long serialVersionUID = 6956534677676656066L;
	
	private static final int ROWS = 4;
	private static final int COLS = 4;
	
	private static final String[][] BTN_TXT = {
				{"1", "2", "3", "4"}, 
				{"5", "6", "7", "8"}, 
				{"9", "0", ".", "+"}, 
				{"-", "*", "/", "="}
			};
	
	private TextField showTxt;
	
	public CalculatorFrame() {
		setTitle("简单计算器");
		setSize(400, 520);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initWidgets();
		addWindowListener(new CalculatorWindowListener(this));
		setVisible(true);
	}
	
	/**
	 * 初始化所有组件
	 */
	private void initWidgets() {
		initTop();
		initBottom();
	}
	
	/**
	 * 初始化整个界面的上部区域，包含一个输入框和一个清除按钮
	 */
	private void initTop() {
		Panel topPanel = new Panel();
		topPanel.setPreferredSize(new Dimension(400, 70));
		topPanel.setLayout(new FlowLayout());
		showTxt = new TextField();
		showTxt.setPreferredSize(new Dimension(300, 60));
		showTxt.setEditable(false);
		topPanel.add(showTxt);
		Button clearBtn = new Button("C");
		clearBtn.addActionListener(new CalculatorActionListener(showTxt));
		clearBtn.setPreferredSize(new Dimension(80, 60));
		topPanel.add(clearBtn);
		add(topPanel);
	}
	
	/**
	 * 初始化整个窗口的下部区域，包含数字和操作符，都用按钮来表示，需要监听按钮的点击事件
	 */
	private void initBottom() {
		Panel bottomPanel = new Panel();
		bottomPanel.setPreferredSize(new Dimension(400, 400));
		bottomPanel.setLayout(new GridLayout(ROWS, COLS));
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				Button btn = new Button(BTN_TXT[row][col]);
				btn.addActionListener(new CalculatorActionListener(showTxt));
				bottomPanel.add(btn);
			}
		}
		add(bottomPanel);
	}
	
}
