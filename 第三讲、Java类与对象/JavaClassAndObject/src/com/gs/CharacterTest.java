package com.gs;

public class CharacterTest {
	
	public static void main(String[] args) {
		Character c = new Character('x');
		char c1 = Character.toUpperCase('x'); // 小写转大写
		char c2 = Character.toLowerCase('X'); // 大写转小写
		int code = Character.codePointAt(new char[]{'a', 'b', 'c'}, 2); // 获取字符数组中指定位置的字符ASCII
		System.out.println("min radix: " + Character.MIN_RADIX + ", max radix: " + Character.MAX_RADIX);
		int cInt = Character.digit('A', 10); // TODO Character.digit()这里可能有问题
		System.out.println(Character.isWhitespace(' '));
		System.out.println(c1);
		System.out.println(code);
		System.out.println(cInt);
	}

}
