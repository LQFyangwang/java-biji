package com.gs.calculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * ��ť����¼��������������������������а�ť�ĵ��
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
		Object obj = e.getSource(); // ��ȡ�¼�Դ����
		if (obj instanceof Button) {
			Button btn = (Button) obj; // ���¼�Դ����ת���ɰ�ť����
			String txt = btn.getLabel(); // ��ȡ��ť��ʾ���ı�
			if (CalculatorUtil.isDigit(btn)) { // �жϰ�ť���ı��Ƿ�Ϊ����
				String originalTxt = resultTxt.getText(); // ��ȡ������ԭʼֵ
				if (CalculatorUtil.containsOperator(originalTxt)) { // �ж���������Ƿ�����в�����������ζ�Ž�Ҫ������ǵڶ���������
					if (!txt.equals(".") && CalculatorUtil.containsSecondDot(originalTxt)) {
						// ����Ĳ���һ��С���㣬����ԭ����������еĵڶ����������Ѿ���һ��С���㣬���ı����ֵ��Ҫ����
						resultTxt.setText(originalTxt + txt);
					} else if (txt.equals(".") && !CalculatorUtil.containsSecondDot(originalTxt)) {
						// ����������һ�� С���㣬����ԭ���ĵڶ���������������С���㣬���ı����ֵ��Ҫ����
						resultTxt.setText(originalTxt + txt);                                 
					} else if (!txt.equals(".") && !CalculatorUtil.containsSecondDot(originalTxt)) {
						// �������Ĳ���һ�� С���㣬ԭ���ĵڶ���������Ҳ������С���㣬���ı����ֵ��Ҫ����
						resultTxt.setText(originalTxt + txt);
					}
				} else { //�����û�а���������������ζ��������ǵ�һ��������
					if (!txt.equals(".") && CalculatorUtil.containsFirstDot(originalTxt)) {
						// ����Ĳ���һ�� С���㣬���ǵ�һ������������С���㣬���ı����ֵ��Ҫ����
						resultTxt.setText(originalTxt + txt);
					} else if (txt.equals(".") && !CalculatorUtil.containsFirstDot(originalTxt)) {
						// ����������һ��С���㣬���ǵ�һ��������������С���㣬���ı����ֵ��Ҫ����
						resultTxt.setText(originalTxt + txt);
					} else if (!txt.equals(".") && !CalculatorUtil.containsFirstDot(originalTxt)) {
						// �������Ĳ���һ��С���㣬���ǵ�һ��������Ҳ������С���㣬���ı����ֵ ��Ҫ����
						resultTxt.setText(originalTxt + txt);
					}
				}
				
			} else if (CalculatorUtil.isOperator(btn)) { // ���������ǲ�����������Ҫ��ȡ����һ����������ֵ
				String originalTxt = resultTxt.getText();
				if (!txt.equals("=")) { // �������Ĳ��ǵȺţ�����ζ�ŵ������+��-��*��/�����ȡ��һ��������
					if (originalTxt.length() > 0) {
						first = Double.valueOf(originalTxt);
					}
					resultTxt.setText(originalTxt + txt);
				} else { // ����������=�ţ����ȡ�ڶ��������������Ҹ��ݲ�����������㣬�� ������Ľ�����õ��ı���
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
				
			} else if (txt.equalsIgnoreCase("c")) { // ���������������ť��������ı����ֵ
				resultTxt.setText("");
			}
		}
	}

}
