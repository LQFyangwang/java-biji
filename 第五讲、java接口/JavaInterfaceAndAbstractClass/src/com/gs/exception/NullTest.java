package com.gs.exception;

public class NullTest {
	
	public static void main(String... args) {
		String a = null;
		String b = a + "abc"; // 把null直接作为字符串处理
		String c;
		// String d = c + "abc"; // 编译时异常，局部变量必须初始化
		StringBuilder sb = null;
		System.out.println(b);
		if (sb != null) { // 可以先对某个要使用的对象进行空判断，如果不为空，才去使用
			System.out.println(sb.append("abc")); // 因为sb是一个空对象，此时去调用他的方法，则出现空指针异常
		}
		//java.lang.NullPointerException
		//at com.gs.exception.NullTest.main(NullTest.java:12)
	}

}
