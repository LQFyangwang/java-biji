package com.gs.exercie;

public class StringTest {
	
	public static void main(String[] args) {
		String str = "a  b    c   d";
		// 字符串的分割操作
		String[] strArray = str.split(" "); // 把str字符串通过指定的字符串分割开来
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
			// str.trim() 用来去掉字符串前面和后面的空格 " "
			//str.length()获取字符串的长度
			if (strArray[i].trim().length() != 0) { 
				System.out.println(strArray[i]);
			}
		}
	}

}