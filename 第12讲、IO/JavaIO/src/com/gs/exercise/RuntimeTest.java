package com.gs.exercise;

import java.io.IOException;

import org.junit.Test;

public class RuntimeTest {
	
	@Test
	public void testRuntime() {
		// Runtime���ʾJava�����л���������������ڵ��ò���ϵͳ���ṩ��һЩ����
		Runtime runtime = Runtime.getRuntime(); // ��ȡ����ʱ����
		try {
			runtime.exec("C:\\Users\\ye\\Desktop\\calc.exe"); // exec     execute�ļ�д����ʾִ��
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
