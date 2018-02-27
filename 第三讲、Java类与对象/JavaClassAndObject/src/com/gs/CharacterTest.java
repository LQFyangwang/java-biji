package com.gs;

public class CharacterTest {
	
	public static void main(String[] args) {
		Character c = new Character('x');
		char c1 = Character.toUpperCase('x'); // Сдת��д
		char c2 = Character.toLowerCase('X'); // ��дתСд
		int code = Character.codePointAt(new char[]{'a', 'b', 'c'}, 2); // ��ȡ�ַ�������ָ��λ�õ��ַ�ASCII
		System.out.println("min radix: " + Character.MIN_RADIX + ", max radix: " + Character.MAX_RADIX);
		int cInt = Character.digit('A', 10); // TODO Character.digit()�������������
		System.out.println(Character.isWhitespace(' '));
		System.out.println(c1);
		System.out.println(code);
		System.out.println(cInt);
	}

}
