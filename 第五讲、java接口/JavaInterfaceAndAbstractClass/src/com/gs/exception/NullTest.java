package com.gs.exception;

public class NullTest {
	
	public static void main(String... args) {
		String a = null;
		String b = a + "abc"; // ��nullֱ����Ϊ�ַ�������
		String c;
		// String d = c + "abc"; // ����ʱ�쳣���ֲ����������ʼ��
		StringBuilder sb = null;
		System.out.println(b);
		if (sb != null) { // �����ȶ�ĳ��Ҫʹ�õĶ�����п��жϣ������Ϊ�գ���ȥʹ��
			System.out.println(sb.append("abc")); // ��Ϊsb��һ���ն��󣬴�ʱȥ�������ķ���������ֿ�ָ���쳣
		}
		//java.lang.NullPointerException
		//at com.gs.exception.NullTest.main(NullTest.java:12)
	}

}
