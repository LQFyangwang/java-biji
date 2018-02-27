import java.util.Scanner;

public class Calculator {
	/**
	 * 5、从键盘上输入两个整数，由用户回答它们的和，差，积，
	 * 商和取余运算结果，并统计出正确答案的个数。
	 * */
	public static void main(String... args) {
		System.out.println("输入两个整数");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("请分别输入和，差，积，商（只取整数部分），余数（用回车隔开）：");
		int sum = scanner.nextInt();//和
		int minus = scanner.nextInt();//差
		int plus = scanner.nextInt();//积
		int divide = scanner.nextInt();//商
		int mode = scanner.nextInt();//余数
		scanner.close();
		int count = 0; // 统计正确的结果数
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
		System.out.println("做对了" + count + "个");
	}

}
