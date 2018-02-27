package com.gs.block;

public class BlockTest {
	
	/**
	 * 静态代码块
	 */
	static {
		System.out.println("static block");
	}
	
	/**
	 * 动态代码块
	 */
	{
		System.out.println("dynamic block");
	}
	
	/**
	 * 构造方法
	 */
	public BlockTest() {
		System.out.println("BlockTest");
	}
	
	public static void main(String[] args) {
		BlockTest bt = new BlockTest();
	}

}
