package com.gs.block;

public class BlockTest {
	
	/**
	 * ��̬�����
	 */
	static {
		System.out.println("static block");
	}
	
	/**
	 * ��̬�����
	 */
	{
		System.out.println("dynamic block");
	}
	
	/**
	 * ���췽��
	 */
	public BlockTest() {
		System.out.println("BlockTest");
	}
	
	public static void main(String[] args) {
		BlockTest bt = new BlockTest();
	}

}
