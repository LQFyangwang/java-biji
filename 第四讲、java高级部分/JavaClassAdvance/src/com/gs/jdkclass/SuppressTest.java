package com.gs.jdkclass;

public class SuppressTest {
	
	public static void test() {
		
	}
	
	@SuppressWarnings("static-access") // ����ʹ��all�����о��涼ѹ����ȥ
	public static void main(String[] args) {
		SuppressTest st = new SuppressTest();
		st.test();
	}

}
