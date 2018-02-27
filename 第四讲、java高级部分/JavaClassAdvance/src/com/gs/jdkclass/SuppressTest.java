package com.gs.jdkclass;

public class SuppressTest {
	
	public static void test() {
		
	}
	
	@SuppressWarnings("static-access") // 可以使用all把所有警告都压制下去
	public static void main(String[] args) {
		SuppressTest st = new SuppressTest();
		st.test();
	}

}
