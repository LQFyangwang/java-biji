import java.util.Random; // import关键字把需要用到的jdk库文件进行导入
import java.util.Scanner;

public class NumberGame {
	
	public static void main(String[] args) {
		// 产生随机数 class Random  专门用于产生随机数的一个class
		Random ran = new Random();
		int ranNumber = ran.nextInt(100); // 表示产生一个<=100的整数的随机数
		System.out.printf("产生的随机数：%d\n",  ranNumber); // "" + ""   两个字符串进行拼接
	
		Scanner scanner = new Scanner(System.in); // System.in表示标准控制台输入
		do {
			/**
			 * System.out.println()自动换行 System.out.print()不会自动换行  print("\n")
			 */
			System.out.println("请输入您猜的数字(0-100之间的整数)：");
				// 等待用户从控制台输入一个整数
		} while (ranNumber != scanner.nextInt());
		System.out.println("恭喜您，猜对了！结果为：" + ranNumber  );
		scanner.close(); // 关闭输入
	}

}