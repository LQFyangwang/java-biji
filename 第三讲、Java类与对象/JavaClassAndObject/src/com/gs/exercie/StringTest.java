package com.gs.exercie;

public class StringTest {
	
	/**
	 * 
	 * @param str 表示需要被分割的字符串
	 * @param split 表示用哪个字符串来进行分割
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
			String a = strArray[i].trim();
			if (a.length() != 0) { 
				System.out.println(strArray[i]);
			}
		}
		System.out.println("*********************************");
		StringTest.test("a,b,c,d,e", ",");
		StringTest.test("a   b    c", " ");// 把中间的一个空格去掉，其他的保留
		StringTest.test1("a   b    c", " ");
	}

}