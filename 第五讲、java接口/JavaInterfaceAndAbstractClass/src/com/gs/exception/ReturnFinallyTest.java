package com.gs.exception;

public class ReturnFinallyTest {
	
	public static int test() {
		try {
			int a = Integer.valueOf("20");
			System.out.println("test");
			return a;
		} catch (NumberFormatException e) {
			System.out.println("数字格式化异常");
		} finally {
			System.out.println("finally..."); // 不管有没有 return，都必须执行，在return前执行
		}
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}

}
