package com.gs.exercie;

public class StringTest {
	
	/**
	 * 
	 * @param str ��ʾ��Ҫ���ָ���ַ���
	 * @param split ��ʾ���ĸ��ַ��������зָ�
	 */
	static void test(String str, String split) {
		String[] strArray = str.split(split);
		for (int i = 0, len = strArray.length; i < len; i++) {
			System.out.println(i + ": " + strArray[i]);
		}
	}
	
	static void test1(String str, String split) {
		String[] strArray = str.split("\\s+");
		for (int i = 0, len = strArray.length; i < len; i++) {
			System.out.println(i + ": " + strArray[i]);
		}
	}
	
	public static void main(String[] args) {
		String str = "a  b    c   d";
		// �ַ����ķָ����
		String[] strArray = str.split(" "); // ��str�ַ���ͨ��ָ�����ַ����ָ��
		// strArray[0] = a;
		// 1 = " "
		// 2 = b
		// 3 = " "
		// 4 = " "
		// 5 = " "
		// 6 = c
		// 7 = " "
		// 8 = " "
		// 9 = d
		for (int i = 0, len = strArray.length; i < len; i++) {
			// str.trim() ����ȥ���ַ���ǰ��ͺ���Ŀո� " "
			//str.length()��ȡ�ַ����ĳ���
			String a = strArray[i].trim();
			if (a.length() != 0) { 
				System.out.println(strArray[i]);
			}
		}
		System.out.println("*********************************");
		StringTest.test("a,b,c,d,e", ",");
		StringTest.test("a   b    c", " ");// ���м��һ���ո�ȥ���������ı���
		StringTest.test1("a   b    c", " ");
	}

}