public class JavaData {
	public static void main(String[] args) {
		// byte����   1��byte  8 λ
		byte byteA = -128;
		byte byteB = 127; // byte�����ֵΪ127
		System.out.println(byteA + byteB);
		// char����
		char charA = 'A';
		char charB = 'B';
		System.out.println(charA);
		System.out.println(charB);
		System.out.println(charA + charB); // ASCII����� 65+66 = 131
		char charC = '��';
		System.out.println(charC);
		// short����
		short shortA = 32767;
		short shortB = -32768;
		System.out.println(shortA + shortB);
		// int����
		int intA = 100; // ����һ��int���͵ı���
		int intB; // ����һ��int���͵ı���
		intB = 100;
		int intC = intA + intB;
		System.out.println(intC);
		// long��������
		long longA = 100;
		System.out.println(longA);
		// float�����ȸ�������
		float floatA = 8.00022f;
		System.out.println(floatA);
		// double˫���ȸ�������
		double doubleA = 109789.09080997987878;
		System.out.println(doubleA);
		// boolean��������
		boolean booleanA = true;
		boolean booleanB = false;
		System.out.println(booleanA);
		System.out.println(booleanB);
		
	}
}