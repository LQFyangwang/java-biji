package com.test;
public class Condition extends Test{
	
	public Condition(int a) {
		super(a);
	}
	public void aaa(){
		test();
		int a=0;
		test(a);
	}
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = 30;
		if (a < b || b < c) { // �����һ������������������������������������жϵڶ���
			System.out.println("true");
		}
		if (a < b | b < c) {
			System.out.println("true");
		}
	}

}
