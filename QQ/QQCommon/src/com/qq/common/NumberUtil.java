package com.qq.common;

public class NumberUtil {
	
	public static boolean isInt(String str) {
		try {
			Integer.valueOf(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
