public class JavaArray {
	public static void main(String[] args) {
		int a[] = {1, 2, 3}; // C���Զ����������ʽ
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*****************");
		int[] b = {1, 2, 3}; // Java���Զ����������ʽ�� ��[]�����������ͺ���
		for (int i = 0; i < 3; i++) {
			System.out.println(b[i]);
		}
		System.out.println("*****************");
		int[] c = new int[30]; // ����һ������Ϊ3����������
		for (int i = 0, len = c.length - 10; i < len; i++) {
			c[i] = i + 1;
		}
		for (int i = 0; i < c.length; i++) { // ��ÿ��ѭ����ʱ������c.length��������ĳ���
			System.out.println(c[i]);
		}
		System.out.println("*****************");
		for (int i = 0, len = c.length; i < len; i++) { // ֻ�ڳ�ʼ�����ʽ����c.length��������ĳ���
			System.out.println(c[i]);
		}
		System.out.println("*****************");
		double[] d = new double[5];
		d[0] = 1.2;
		d[3] = 2.4;
		for (int i = 0, len = d.length; i < len; i++) {
			System.out.println(d[i]);
		}
		System.out.println("��ά����");
		int[][] e = {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
		for (int row = 0; row < e.length; row++) { // e.length���������������
			for (int col = 0; col < e[row].length; col++) { // e[row]��ʾ������ĵ�row��, e[row].length��row���ж��ٸ�����
				System.out.println(e[row][col]);
			}
		}
	}
}