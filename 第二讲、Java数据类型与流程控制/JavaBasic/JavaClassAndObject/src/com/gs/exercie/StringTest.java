package com.gs.exercie;

public class StringTest {
	
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
			if (strArray[i].trim().length() != 0) { 
				System.out.println(strArray[i]);
			}
		}
	}

}