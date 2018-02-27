package com.gs;

public class Parent {
	
	String a; // a是默认的，同一个包中的所有类访问
	private int b; // 本类
	protected int c; // 不能在其他包的非子类访问
	

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
