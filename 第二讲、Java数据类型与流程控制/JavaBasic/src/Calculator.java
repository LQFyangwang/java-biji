import java.util.Scanner;

public class Calculator {
	/**
	 * 5���Ӽ����������������������û��ش����ǵĺͣ������
	 * �̺�ȡ������������ͳ�Ƴ���ȷ�𰸵ĸ�����
	 * */
	public static void main(String... args) {
		System.out.println("������������");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("��ֱ�����ͣ�������̣�ֻȡ�������֣����������ûس���������");
		int sum = scanner.nextInt();//��
		int minus = scanner.nextInt();//��
		int plus = scanner.nextInt();//��
		int divide = scanner.nextInt();//��
		int mode = scanner.nextInt();//����
		scanner.close();
		int count = 0; // ͳ����ȷ�Ľ����
		if (num1 + num2 == sum) {
			count++;
		}
		if (num1 - num2 == minus) {
			count++;
		}
		if (num1 * num2 == plus) {
			count++;
		}
		if (num1 / num2 == divide) {
			count++;
		}
		if (num1 % num2 == mode) {
			count++;
		}
		System.out.println("������" + count + "��");
	}

}
