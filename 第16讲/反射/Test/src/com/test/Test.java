package com.test;

/**
 * 这是一个测试类
 * @author 李斌
 * @version 1.0
 *
 */
public class Test {
	
	/**
	 * 常量
	 */
	public static final int TEST = 100;
	
	/**
	 * 测试方法
	 */
	public void test() {
		
	}
	
	/**
	 * 重载的Test方法
	 * @param a 一个整数类型的值
	 * @return 返回加10后的结果
	 */
	public static int test(int a) {
		return 0;
	}
	
	public Test(int a) {
		
	}
	
	public Test(int a, int b) {
		this(a);
	}

}
