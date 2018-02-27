package com.gs.exception;

public class MyNumberExceptionTest {
	
	public static void test(int a) throws MyNumberException {
		int b = Integer.valueOf("abc");
		if (a < 0) {
			throw new MyNumberException("���ֱ�����ڵ���0");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			test(-10);
		} catch (MyNumberException e) {
			System.out.println(e.getMessage()); // ��ȡ�쳣�Ĵ�����Ϣ
			System.out.println(e.getCause());
			e.printStackTrace(); // �쳣��ջ��Ϣ���������������õĴ�����Ϣ
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
