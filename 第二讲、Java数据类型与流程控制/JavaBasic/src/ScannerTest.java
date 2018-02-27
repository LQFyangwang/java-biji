import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int age = 0;
		do {
			System.out.println("请输入一个姓名和年龄（回车隔开）：");
			name = scanner.next(); // 
			age = scanner.nextInt(); // 第二遍输入的时候，xx是被nextInt()接收的，则出现异常java.util.InputMismatchException（输入不匹配异常）
			System.out.println("您输入的姓名和年龄：" + name + ", " + age);
		} while (!name.equals("abc") && age != 18);
		scanner.close();
		System.out.println("猜对了。。。");
	}

}
