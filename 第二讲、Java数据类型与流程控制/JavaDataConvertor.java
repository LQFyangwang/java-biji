public class JavaDataConvertor {
	public static void main(String[] args) {
		int a = 129;
		byte b = (byte) a; // ��ʽ����ת��
		int c = b; // ��ʽ����ת�� 
		System.out.println(b);
		long d = 10000;
		double e = d;
		float f = d;
		double g = f;
		long h = (long) g;
		long i = (long) f;
		int j = (int) g;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
}