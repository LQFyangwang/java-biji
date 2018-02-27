package com.gs.exception;

public class NumberTest1 {
	
	public static void main(String[] args) {
		try {
			int a = Integer.valueOf("abc");
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println("请输入一个数字类型的字符串");
		}
		System.out.println("aaaa");
	}

}
