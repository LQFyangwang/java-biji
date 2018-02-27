public class JavaOperator {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		if (a >= b) { // if (a > b || a = b)
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
		int c = 0;
		c = a >= b ? a : b;
		System.out.println(c);
	}
}