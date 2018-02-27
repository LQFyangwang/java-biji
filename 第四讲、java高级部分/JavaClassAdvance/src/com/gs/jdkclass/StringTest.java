package com.gs.jdkclass;

public class StringTest {
	
	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");
		String c = "abc";
		String d= new String("abc");
		System.out.println(a + ", " + b);
		System.out.println(a == b); // a与b不是同一个对象
		System.out.println(a == c); // true
		c = "abcd";
		System.out.println(a == c); // false
		System.out.println(b == d); // false
		String e = "a" + "b"; // 此句中会生成三个String对象:a,     b,        ab=====>编译优化：String e = "ab";
		
		System.out.println("===========================================");
		StringBuffer f = new StringBuffer("abc");
		String g = f.toString(); // StringBuffer转换成String对象，只要调用StringBuffer对象的toString()方法
		StringBuffer h = new StringBuffer("def");
		StringBuffer i = f.append(h); // 使用append方法进行字符串的拼接，不能直接使用+号拼接
		
		StringBuilder j = new StringBuilder("abc");
		StringBuilder k = new StringBuilder("def");
		StringBuilder l = j.append(k);
		
		String str1 = "dlkfjdslkfjdslk";
		// 搜索字符串
		System.out.println(str1.indexOf("lk"));// 判断lk字符串有没有出现在str1字符串中，如果出现了，则返回从左往右的第一次出现的索引
		System.out.println(str1.lastIndexOf("lk")); // 判断lk字符串有没有出现在str1字符串中，如果出现了，则返回从右往左的第一次出现的索引
		// 判断是否包含某个字符串
		System.out.println(str1.contains("lk"));
		// 整个字符串转成大写
		String str2 = str1.toUpperCase();
		System.out.println(str1 + ", " + str2);
		// 整个字符串转小写
		String str3 = str2.toLowerCase();
		System.out.println(str2 + ", " + str3);
		// 去除左右空格的方法
		String str4 = " a b ";
		System.out.println(str4.trim()); // 字符串中间出现的空格不管
		String stuNo = "stu_001";
		// 判断是否以某个字符串开头
		System.out.println(stuNo.startsWith("stu_"));
		// 判断是否以某个字符串结尾
		System.out.println(stuNo.endsWith("001"));
		// 获取字符串的长度
		System.out.println(stuNo.length());
		// 把整个字符串转成字符数组
		char[] charArray = stuNo.toCharArray();
		for (int ii = 0, len = charArray.length; ii < len; ii++) {
			System.out.print(charArray[ii] + "\t");
		}
		System.out.println();
		// 获取指定索引的字符
		System.out.println(stuNo.charAt(2)); // 不能超出字符串的最大索引值，如果超出，则数组越界 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
		// 获取指定范围内的子串
		System.out.println(stuNo.substring(2, 4)); // 第一个参数是开始索引（包含），第二个参数是结束索引（不包含）
		System.out.println(stuNo.substring(3)); // 从开始位置到整个字符串的最末尾
		System.out.println(stuNo.codePointAt(2)); // 输出指定索引上的字符所对应的ASCII
		String newStuNo = stuNo.concat("abc"); // String类提供的字符串的拼接方法
		System.out.println(newStuNo);
		byte[] bytes = stuNo.getBytes(); // 返回字符串所对应的字节数组, JavaIO(Java的输入输出)用得多
		for (int ii = 0, len = bytes.length; ii < len; ii++) {
			System.out.print(bytes[ii] + "\t");
		}
		System.out.println();
		String str5 = "";
		System.out.println(str5.isEmpty()); // 判断一个字符串是否为空串，一个字符串对象中什么字符都没有才叫空串。跟null完全不一样
		String stuNoR = stuNo.replace("stu", "ht"); // 以第二个参数去替换字符串中出现的第一个参数
		System.out.println(stuNo + ", " + stuNoR);
		String str6 = "aa bb cc dd";
		String[] str6Array = str6.split(" "); // 按指定的字符串把原串进行分割
		for (int ii = 0, len = str6Array.length; ii < len; ii++) {
			System.out.print(str6Array[ii] + "\t");
		}
		System.out.println();
		int intA = 123;
		String strA = String.valueOf(intA); // String类的静态方法， 把基本数据类型的值转成字符串，int, long, boolean, double, float, char
		System.out.println(strA);
		System.out.println(strA instanceof String); // 判断strA对象是否为String类的实例
		System.out.println(strA.getClass().getName()); // java.lang.String
 		
	}

}
