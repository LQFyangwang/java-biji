package com.gs.jdkclass;

public class StringTest {
	
	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");
		String c = "abc";
		String d= new String("abc");
		System.out.println(a + ", " + b);
		System.out.println(a == b); // a��b����ͬһ������
		System.out.println(a == c); // true
		c = "abcd";
		System.out.println(a == c); // false
		System.out.println(b == d); // false
		String e = "a" + "b"; // �˾��л���������String����:a,     b,        ab=====>�����Ż���String e = "ab";
		
		System.out.println("===========================================");
		StringBuffer f = new StringBuffer("abc");
		String g = f.toString(); // StringBufferת����String����ֻҪ����StringBuffer�����toString()����
		StringBuffer h = new StringBuffer("def");
		StringBuffer i = f.append(h); // ʹ��append���������ַ�����ƴ�ӣ�����ֱ��ʹ��+��ƴ��
		
		StringBuilder j = new StringBuilder("abc");
		StringBuilder k = new StringBuilder("def");
		StringBuilder l = j.append(k);
		
		String str1 = "dlkfjdslkfjdslk";
		// �����ַ���
		System.out.println(str1.indexOf("lk"));// �ж�lk�ַ�����û�г�����str1�ַ����У���������ˣ��򷵻ش������ҵĵ�һ�γ��ֵ�����
		System.out.println(str1.lastIndexOf("lk")); // �ж�lk�ַ�����û�г�����str1�ַ����У���������ˣ��򷵻ش�������ĵ�һ�γ��ֵ�����
		// �ж��Ƿ����ĳ���ַ���
		System.out.println(str1.contains("lk"));
		// �����ַ���ת�ɴ�д
		String str2 = str1.toUpperCase();
		System.out.println(str1 + ", " + str2);
		// �����ַ���תСд
		String str3 = str2.toLowerCase();
		System.out.println(str2 + ", " + str3);
		// ȥ�����ҿո�ķ���
		String str4 = " a b ";
		System.out.println(str4.trim()); // �ַ����м���ֵĿո񲻹�
		String stuNo = "stu_001";
		// �ж��Ƿ���ĳ���ַ�����ͷ
		System.out.println(stuNo.startsWith("stu_"));
		// �ж��Ƿ���ĳ���ַ�����β
		System.out.println(stuNo.endsWith("001"));
		// ��ȡ�ַ����ĳ���
		System.out.println(stuNo.length());
		// �������ַ���ת���ַ�����
		char[] charArray = stuNo.toCharArray();
		for (int ii = 0, len = charArray.length; ii < len; ii++) {
			System.out.print(charArray[ii] + "\t");
		}
		System.out.println();
		// ��ȡָ���������ַ�
		System.out.println(stuNo.charAt(2)); // ���ܳ����ַ������������ֵ�����������������Խ�� Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
		// ��ȡָ����Χ�ڵ��Ӵ�
		System.out.println(stuNo.substring(2, 4)); // ��һ�������ǿ�ʼ���������������ڶ��������ǽ�����������������
		System.out.println(stuNo.substring(3)); // �ӿ�ʼλ�õ������ַ�������ĩβ
		System.out.println(stuNo.codePointAt(2)); // ���ָ�������ϵ��ַ�����Ӧ��ASCII
		String newStuNo = stuNo.concat("abc"); // String���ṩ���ַ�����ƴ�ӷ���
		System.out.println(newStuNo);
		byte[] bytes = stuNo.getBytes(); // �����ַ�������Ӧ���ֽ�����, JavaIO(Java���������)�õö�
		for (int ii = 0, len = bytes.length; ii < len; ii++) {
			System.out.print(bytes[ii] + "\t");
		}
		System.out.println();
		String str5 = "";
		System.out.println(str5.isEmpty()); // �ж�һ���ַ����Ƿ�Ϊ�մ���һ���ַ���������ʲô�ַ���û�вŽпմ�����null��ȫ��һ��
		String stuNoR = stuNo.replace("stu", "ht"); // �Եڶ�������ȥ�滻�ַ����г��ֵĵ�һ������
		System.out.println(stuNo + ", " + stuNoR);
		String str6 = "aa bb cc dd";
		String[] str6Array = str6.split(" "); // ��ָ�����ַ�����ԭ�����зָ�
		for (int ii = 0, len = str6Array.length; ii < len; ii++) {
			System.out.print(str6Array[ii] + "\t");
		}
		System.out.println();
		int intA = 123;
		String strA = String.valueOf(intA); // String��ľ�̬������ �ѻ����������͵�ֵת���ַ�����int, long, boolean, double, float, char
		System.out.println(strA);
		System.out.println(strA instanceof String); // �ж�strA�����Ƿ�ΪString���ʵ��
		System.out.println(strA.getClass().getName()); // java.lang.String
 		
	}

}
