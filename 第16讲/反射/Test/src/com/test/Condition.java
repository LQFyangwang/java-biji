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
		if (a < b || b < c) { // 如果第一个条件不成立，则整个结果不成立，不会判断第二个
			System.out.println("true");
		}
		if (a < b | b < c) {
			System.out.println("true");
		}
	}

}
