package com.gs;

public class IntegerTest {

	public static void main(String[] args) {
		Integer a = new Integer(128); // 实例化一个Integer包装类（整数）的数据，值初始化为10
		int b = a.intValue(); // 从Integer类型的数据获取int整数值数据
		byte c = a.byteValue();
		String d = a.toString(); // 已经转成了字符串
		Integer e = new Integer(130);
		Integer f = Integer.valueOf(10); // 把一个int类型的值包装成Integer类型的值
		Integer g = Integer.valueOf("100"); // 把一字字符串转化成对应的数字, 后面的字符串必须是一串数字，不能是其他的字符
		int ff = Integer.parseInt("100"); // 把字符串直接转化成int类型
		Integer fff = Integer.valueOf("100", 16); // 把字符串转化成指定进制的Integer包装类的数据
		int ffff = Integer.parseInt("100", 8); // 把字符串转化成指定进制的int
		// Integer h = Integer.valueOf("abc"); // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"  数字格式化错误
		int max = Integer.max(100, 200); // 求两个数中最大整数
		int min = Integer.min(100, 200); // 求两个数中最小整数
		int sum = Integer.sum(100, 200); // 求两个数的和
		System.out.println(a); // System.out.println(obj); ==> System.out.println(obj.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a.compareTo(e)); // a的值与e的进行比较， 如果a==e，则返回0，如果a > e，则返回1，如果a < e，则返回-1
		System.out.println(g);
		System.out.println(Integer.toBinaryString(10)); // 把整数转化成二进制的字符串数据
		System.out.println(Integer.toHexString(15)); // 把整数转化成16进制的字符串数据
		System.out.println(Integer.toOctalString(10)); // 把整数转化成8进制的字符串数据
	}
}
