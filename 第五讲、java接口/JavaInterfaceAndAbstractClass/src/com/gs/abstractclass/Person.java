package com.gs.abstractclass;

/**
 * ������
 *
 */
public abstract class Person {
	
	public static final int COUNT = 5;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void read() {
		
	}
	
	public abstract void eat(); // ���󷽷���������ʵ�������˳��󷽷�Ϊ�ǳ���������ṩ��һ������ʵ�ֵĹ淶

}
