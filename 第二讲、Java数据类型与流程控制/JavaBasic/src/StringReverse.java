import java.util.Scanner;

public class StringReverse {
	//字符串到过来输出
	public static void main(String[] args) {
		System.out.println("请输入需要反序输出的字符串");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		char[] charArray = str.toCharArray();
		for (int len = charArray.length, i = len - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
