package com.gs.calculator;

import java.awt.Button;

public class CalculatorUtil {
	
	private static final String[] DIGITS = {".", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private static final String[] OPERATORS = {"+", "-", "*", "/", "="};
	
	/**
	 * �ж��Ƿ�����������
	 * @param btn
	 * @return
	 */
	public static boolean isDigit(Button btn) {
		String txt = btn.getLabel();
		for (int i = 0, len = DIGITS.length; i < len; i++) {
			if (txt.equals(DIGITS[i])) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * �ж��Ƿ������ǲ�����
	 * @param btn
	 * @return
	 */
	public static boolean isOperator(Button btn) {
		String txt = btn.getLabel();
		for (int i = 0, len = OPERATORS.length; i < len; i++) {
			if (txt.equals(OPERATORS[i])) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * �жϵ�һ���������Ƿ����С����
	 * @param txt
	 * @return
	 */
	public static boolean containsFirstDot(String txt) {
		if (txt.indexOf(".") > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * �жϵڶ����������Ƿ����С����
	 * @param txt
	 * @return
	 */
	public static boolean containsSecondDot(String txt) {
		int operatorIndex = operatorIndex(txt);
		if (txt.lastIndexOf(".") > operatorIndex) {
			return true;
		}
		return false;
	}
	
	/**
	 * ��ȡ������������λ�� 
	 * @param txt
	 * @return
	 */
	public static int operatorIndex(String txt) {
		int operatorIndex = txt.indexOf("+");
		if (operatorIndex < 0) {
			operatorIndex = txt.indexOf("-");
		}
		if (operatorIndex < 0) {
			operatorIndex = txt.indexOf("*");
		}
		if (operatorIndex < 0) {
			operatorIndex = txt.indexOf("/");
		}
		return operatorIndex;
	}
	
	/*
	 * ��ȡ�ڶ���������
	 */
	public static String getSecond(String txt) {
		int opeIndex = operatorIndex(txt);
		return txt.substring(opeIndex + 1);
	}
	
	/**
	 * �ж��Ƿ�Ϊ�ӷ�
	 * @param txt
	 * @return
	 */
	public static boolean isAdd(String txt) {
		return txt.indexOf("+") > 0;
	}
	
	/**
	 * �ж��� ��Ϊ���� 
	 * @param txt
	 * @return
	 */
	public static boolean isSub(String txt) {
		return txt.indexOf("-") > 0;
	}
	
	/**
	 * �ж��Ƿ�Ϊ����
	 * @param txt
	 * @return
	 */
	public static boolean isDivide(String txt) {
		return txt.indexOf("/") > 0;
	}
	
	/**
	 * �ж��Ƿ�Ϊ�˷�
	 * @param txt
	 * @return
	 */
	public static boolean isMultiple(String txt) {
		return txt.indexOf("*") > 0;
	}
	
	/**
	 * �ж��Ƿ�����в�����
	 * @param originalTxt
	 * @return
	 */
	public static boolean containsOperator(String originalTxt) {
		if (originalTxt.indexOf("+") > 0 || originalTxt.indexOf("-") > 0 || originalTxt.indexOf("*") > 0 || originalTxt.indexOf("/") > 0) {
			return true;
		}
		return false;
	}

}
