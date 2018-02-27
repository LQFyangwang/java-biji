public class JavaBitOperator {
	public static void main(String[] args) {
		int a = 89; // 00000...01011001
		int b = 68; // 00000...01000100
		int c = a & b; // 00000...01000000  64
		int d = a | b; // 00000...01011101  93
		int e = ~a; // 11111...10100110 -90
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a << 3); // 00000....01011001000 712
		System.out.println(a >> 3); // 00000....01011 11
		/**
		Linux系统中的权限控制
			R（可读） W（可写） E（可执行）
			4 100       2 010       1   001
		假设A用户有可读的权限：4 100
		假设A用户有可写的权限：2 010
		假设A用户有可执行的权限：1 001

		假设A用户有可读和可写的权限：100 & 010 110 => 6
		假设A用户有可读和可执行的权限：100 & 001 101 => 5
		假设A用户有可读和可写和可执行的权限：100 & 010 & 001 111 => 7

		7所有权限
		可读+可写的权限 4 + 2 = 6
		可写+可执行权限 2 + 1 = 3
		*/
	}
}