package com.gs;

public class Parent {
	
	String a; // a��Ĭ�ϵģ�ͬһ�����е����������
	private int b; // ����
	protected int c; // �������������ķ��������
	

	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
	void test() {
		System.out.println("parent test");
		System.out.println(this.a + ", " + this.b);
	}
	
	protected void test1() {
		
	}
	
	private void test2() {
		
	}

}
