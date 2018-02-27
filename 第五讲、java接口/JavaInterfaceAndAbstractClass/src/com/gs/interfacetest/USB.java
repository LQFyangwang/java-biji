package com.gs.interfacetest;

public interface USB { //interface接口
	//接口只能有抽象方法，不能有成员方法，可以有常量。
	int A = 10; // public static final int a = 10;
	public int B = 20; // public static final int B = 20;

	public void test(); // public abstract void test(); 开发者通常使用此种形式

	public void test(int a);

	public abstract void eat(); // public abstract void eat();

	void sleep(); // public abstract void sleep();
}
