package com.ht.test5;

public abstract class AclassA {

	//抽象类要用abstract关键字修饰
	
	public int b = 0;
	public final String NAME="张三";
	
	public void test(){
		//这是抽象类的普通方法
	}
	//抽象方法，必须含有abstract关键字（修饰符）
	public abstract void test1();
	
	abstract void test2();
	
	public abstract void test3();
}
