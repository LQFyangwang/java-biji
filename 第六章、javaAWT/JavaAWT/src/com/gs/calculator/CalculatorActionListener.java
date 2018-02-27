package com.gs.calculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * 按钮点击事件监听器，监听计算器界面所有按钮的点击
 *
 */
public class CalculatorActionListener implements ActionListener {
	
	private TextField resultTxt;
	private static double first;
	private static double second;
	
	public CalculatorActionListener(TextField resultTxt) {
		this.resultTxt = resultTxt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // 获取事件源对象
		if (obj instanceof Button) {
			Button btn = (Button) obj; // 把事件源对象转化成按钮对象
			String txt = btn.getLabel(); // 获取按钮显示的文本
			if (CalculatorUtil.isDigit(btn)) { // 判断按钮的文本是否为数字
				String originalTxt = resultTxt.getText(); // 获取输入框的原始值
				if (CalculatorUtil.containsOperator(originalTxt)) { // 判断输入框中是否包含有操作符，则意味着将要输入的是第二个操作数
					if (!txt.equals(".") && CalculatorUtil.containsSecondDot(originalTxt)) {
						// 点击的不是一个小数点，但是原来的输入框中的第二个操作数已经有一个小数点，则文本框的值需要更新
						resultTxt.setText(originalTxt + txt);
					} else if (txt.equals(".") && !CalculatorUtil.containsSecondDot(originalTxt)) {
						// 如果点击的是一个 小数点，但是原来的第二个操作数不包含小数点，则文本框的值需要更新
						resultTxt.setText(originalTxt + txt);                                 
					} else if (!txt.equals(".") && !CalculatorUtil.containsSecondDot(originalTxt)) {
						// 如果点击的不是一个 小数点，原来的第二个操作数也不包含小数点，则文本框的值需要更新
						resultTxt.setText(originalTxt + txt);
					}
				} else { //　如果没有包含操作符，则意味着输入的是第一个操作数
					if (!txt.equals(".") && CalculatorUtil.containsFirstDot(originalTxt)) {
						// 点击的不是一个 小数点，但是第一个操作数包含小数点，则文本框的值需要更新
						resultTxt.setText(originalTxt + txt);
					} else if (txt.equals(".") && !CalculatorUtil.containsFirstDot(originalTxt)) {
						// 如果点击的是一个小数点，但是第一个操作数不包含小数点，则文本框的值需要更新
						resultTxt.setText(originalTxt + txt);
					} else if (!txt.equals(".") && !CalculatorUtil.containsFirstDot(originalTxt)) {
						// 如果点击的不是一个小数点，但是第一个操作数也不包含小数点，则文本框的值 需要更新
						resultTxt.setText(originalTxt + txt);
					}
				}
				
			} else if (CalculatorUtil.isOperator(btn)) { // 如果点击的是操作符，则需要获取到第一个操作数的值
				String originalTxt = resultTxt.getText();
				if (!txt.equals("=")) { // 如果点击的不是等号，则意味着点击的是+，-，*，/，则获取第一个操作数
					if (originalTxt.length() > 0) {
						first = Double.valueOf(originalTxt);
					}
					resultTxt.setText(originalTxt + txt);
				} else { // 如果点击的是=号，则获取第二个操作数，并且根据操作符完成运算，再 把运算的结果设置到文本框
					second = Double.valueOf(CalculatorUtil.getSecond(originalTxt));
					if (CalculatorUtil.isAdd(originalTxt)) {
						resultTxt.setText(first + second + "");
					} else if (CalculatorUtil.isSub(originalTxt)) {
						resultTxt.setText((first - second) + "");
					} else if (CalculatorUtil.isDivide(originalTxt)) {
						resultTxt.setText(first / second + ""); 
					} else if (CalculatorUtil.isMultiple(originalTxt)) {
						resultTxt.setText(first * second + ""); 
					}
				}
				
			} else if (txt.equalsIgnoreCase("c")) { // 如果点击的是清除按钮，则清空文本框的值
				resultTxt.setText("");
			}
		}
	}

}
