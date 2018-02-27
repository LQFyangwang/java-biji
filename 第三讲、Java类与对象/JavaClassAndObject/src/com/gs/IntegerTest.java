package com.gs;

public class IntegerTest {

	public static void main(String[] args) {
		Integer a = new Integer(128); // ʵ����һ��Integer��װ�ࣨ�����������ݣ�ֵ��ʼ��Ϊ10
		int b = a.intValue(); // ��Integer���͵����ݻ�ȡint����ֵ����
		byte c = a.byteValue();
		String d = a.toString(); // �Ѿ�ת�����ַ���
		Integer e = new Integer(130);
		Integer f = Integer.valueOf(10); // ��һ��int���͵�ֵ��װ��Integer���͵�ֵ
		Integer g = Integer.valueOf("100"); // ��һ���ַ���ת���ɶ�Ӧ������, ������ַ���������һ�����֣��������������ַ�
		int ff = Integer.parseInt("100"); // ���ַ���ֱ��ת����int����
		Integer fff = Integer.valueOf("100", 16); // ���ַ���ת����ָ�����Ƶ�Integer��װ�������
		int ffff = Integer.parseInt("100", 8); // ���ַ���ת����ָ�����Ƶ�int
		// Integer h = Integer.valueOf("abc"); // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"  ���ָ�ʽ������
		int max = Integer.max(100, 200); // �����������������
		int min = Integer.min(100, 200); // ������������С����
		int sum = Integer.sum(100, 200); // ���������ĺ�
		System.out.println(a); // System.out.println(obj); ==> System.out.println(obj.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a.compareTo(e)); // a��ֵ��e�Ľ��бȽϣ� ���a==e���򷵻�0�����a > e���򷵻�1�����a < e���򷵻�-1
		System.out.println(g);
		System.out.println(Integer.toBinaryString(10)); // ������ת���ɶ����Ƶ��ַ�������
		System.out.println(Integer.toHexString(15)); // ������ת����16���Ƶ��ַ�������
		System.out.println(Integer.toOctalString(10)); // ������ת����8���Ƶ��ַ�������
	}
}
