package com.gs.calculator;

import java.awt.Button;

public class CalculatorUtil {
	
	private static final String[] DIGITS = {".", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private static final String[] OPERATORS = {"+", "-", "*", "/", "="};
	
	/**
	 * 判断是否点击的是数字
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
	 * 判断是否点击的是操作符
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
	 * 判断第一个操作数是否包含小数点
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
	 * 判断第二个操作数是否包含小数点
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
	 * 获取操作符的索引位置 
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
	 * 获取第二个操作数
	 */
	public static String getSecond(String txt) {
		int opeIndex = operatorIndex(txt);
		return txt.substring(opeIndex + 1);
	}
	
	/**
	 * 判断是否为加法
	 * @param txt
	 * @return
	 */
	public static boolean isAdd(String txt) {
		return txt.indexOf("+") > 0;
	}
	
	/**
	 * 判断是 否为减法 
	 * @param txt
	 * @return
	 */
	public static boolean isSub(String txt) {
		return txt.indexOf("-") > 0;
	}
	
	/**
	 * 判断是否为除法
	 * @param txt
	 * @return
	 */
	public static boolean isDivide(String txt) {
		return txt.indexOf("/") > 0;
	}
	
	/**
	 * 判断是否为乘法
	 * @param txt
	 * @return
	 */
	public static boolean isMultiple(String txt) {
		return txt.indexOf("*") > 0;
	}
	
	/**
	 * 判断是否包含有操作符
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
