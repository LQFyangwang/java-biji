package com.gs.exception;

public class NumberTest1 {
	
	public static void main(String[] args) {
		try {
			int a = Integer.valueOf("abc");
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println("������һ���������͵��ַ���");
		}
		System.out.println("aaaa");
	}

}
