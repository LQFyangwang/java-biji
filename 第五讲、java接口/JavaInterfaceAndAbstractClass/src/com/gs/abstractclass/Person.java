package com.gs.abstractclass;

/**
 * 抽象类
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
	
	public abstract void eat(); // 抽象方法，不可以实现它，此抽象方法为非抽象的子类提供了一个必须实现的规范

}
