public class JavaDataConvertor {
	public static void main(String[] args) {
		int a = 129;
		byte b = (byte) a; // 显式类型转换
		int c = b; // 隐式类型转换 
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