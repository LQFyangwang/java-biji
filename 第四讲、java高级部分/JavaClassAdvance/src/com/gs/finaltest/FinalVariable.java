package com.gs.finaltest;

import com.gs.common.Constants;

public class FinalVariable {
	
	private final String a = "abc"; // 常量，只能使用，不能被修改
	public static final String b = "abc"; // 通常会把常量定义成static的常量
	
	public void test() {
		System.out.println(FinalVariable.b); // 直接通过类来引用static修饰的常量
		System.out.println(Constants.APP_NAME);
	}

}
