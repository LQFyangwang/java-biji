public class JavaData {
	public static void main(String[] args) {
		// byte类型   1个byte  8 位
		byte byteA = -128;
		byte byteB = 127; // byte的最大值为127
		System.out.println(byteA + byteB);
		// char类型
		char charA = 'A';
		char charB = 'B';
		System.out.println(charA);
		System.out.println(charB);
		System.out.println(charA + charB); // ASCII码相加 65+66 = 131
		char charC = '中';
		System.out.println(charC);
		// short类型
		short shortA = 32767;
		short shortB = -32768;
		System.out.println(shortA + shortB);
		// int类型
		int intA = 100; // 定义一个int类型的变量
		int intB; // 声明一个int类型的变量
		intB = 100;
		int intC = intA + intB;
		System.out.println(intC);
		// long长整型数
		long longA = 100;
		System.out.println(longA);
		// float单精度浮点类型
		float floatA = 8.00022f;
		System.out.println(floatA);
		// double双精度浮点类型
		double doubleA = 109789.09080997987878;
		System.out.println(doubleA);
		// boolean布尔类型
		boolean booleanA = true;
		boolean booleanB = false;
		System.out.println(booleanA);
		System.out.println(booleanB);
		
	}
}