package com.gs.jdkclass;

public class StringPerformanceTest {
	
	public static void main(String[] args) {
		String s1 = "abc";
		long start = System.currentTimeMillis(); // ��ȡϵͳ�ĵ�ǰʱ�䣬�Ժ���Ϊ��λ��
		for (int i = 0; i < 5000; i++) {
			String s2 = "abc";
			s1 = s1 + s2;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start); // ���������Ľ���ʱ���ȥ����������ʼ��ʱ��
		
		StringBuilder sb1 = new StringBuilder("abc");
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			StringBuilder sb2 = new StringBuilder("abc");
			sb1 = sb1.append(sb2);
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		
		StringBuffer sb2 = new StringBuffer("abc");
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			StringBuffer sb3 = new StringBuffer("abc");
			sb2 = sb2.append(sb3);
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
	}

}
