public class JavaArray {
	public static void main(String[] args) {
		int a[] = {1, 2, 3}; // C语言定义数组的形式
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*****************");
		int[] b = {1, 2, 3}; // Java语言定义数组的形式， 把[]放在数据类型后面
		for (int i = 0; i < 3; i++) {
			System.out.println(b[i]);
		}
		System.out.println("*****************");
		int[] c = new int[30]; // 声明一个长度为3的整型数组
		for (int i = 0, len = c.length - 10; i < len; i++) {
			c[i] = i + 1;
		}
		for (int i = 0; i < c.length; i++) { // 在每次循环的时候者用c.length返回数组的长度
			System.out.println(c[i]);
		}
		System.out.println("*****************");
		for (int i = 0, len = c.length; i < len; i++) { // 只在初始化表达式中用c.length返回数组的长度
			System.out.println(c[i]);
		}
		System.out.println("*****************");
		double[] d = new double[5];
		d[0] = 1.2;
		d[3] = 2.4;
		for (int i = 0, len = d.length; i < len; i++) {
			System.out.println(d[i]);
		}
		System.out.println("二维数组");
		int[][] e = {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
		for (int row = 0; row < e.length; row++) { // e.length返回数组的总行数
			for (int col = 0; col < e[row].length; col++) { // e[row]表示数组里的第row行, e[row].length第row行有多少个数据
				System.out.println(e[row][col]);
			}
		}
	}
}