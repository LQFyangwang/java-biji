package com.gs.exception;

public class ReturnFinallyTest {
	
	public static int test() {
		try {
			int a = Integer.valueOf("20");
			System.out.println("test");
			return a;
		} catch (NumberFormatException e) {
			System.out.println("���ָ�ʽ���쳣");
		} finally {
			System.out.println("finally..."); // ������û�� return��������ִ�У���returnǰִ��
		}
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}

}
