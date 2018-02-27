package com.gs.block;

public class BlockSunTest extends BlockTest {
	
	static {
		System.out.println("sun static");
	}
	
	{
		System.out.println("sun dynamic");
	}
	
	public BlockSunTest() {
		System.out.println("BlockSunTest");
	}
	
	public static void main(String[] args) {
		BlockSunTest bst = new BlockSunTest();
	}

}
