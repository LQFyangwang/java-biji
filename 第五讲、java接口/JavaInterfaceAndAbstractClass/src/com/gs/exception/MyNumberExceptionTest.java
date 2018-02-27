package com.gs.exception;

public class MyNumberExceptionTest {
	
	public static void test(int a) throws MyNumberException {
		int b = Integer.valueOf("abc");
		if (a < 0) {
			throw new MyNumberException("数字必须大于等于0");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			test(-10);
		} catch (MyNumberException e) {
			System.out.println(e.getMessage()); // 获取异常的错误信息
			System.out.println(e.getCause());
			e.printStackTrace(); // 异常堆栈信息，包含有上面设置的错误信息
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
