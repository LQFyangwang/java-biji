package com.gs.finaltest;

import com.gs.common.Constants;

public class FinalVariable {
	
	private final String a = "abc"; // ������ֻ��ʹ�ã����ܱ��޸�
	public static final String b = "abc"; // ͨ����ѳ��������static�ĳ���
	
	public void test() {
		System.out.println(FinalVariable.b); // ֱ��ͨ����������static���εĳ���
		System.out.println(Constants.APP_NAME);
	}

}
