import java.util.Scanner;

public class StringEncrypt {
	
	public static void main(String... args) {
		System.out.println("请输入一个英文字符串");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		// 获取字符串中的每一个字符
		char[] charArray = str.toCharArray(); // str.toCharArray() 把字符串中的每一个字符按顺序放到字符数组中
		for (int i = 0, len = charArray.length; i < len; i++) {
			char c = charArray[i];
			if ((c >= 120 && c <= 123) || (c >= 88 && c <= 90)) {
				charArray[i] = (char) (c - 23);
			} else {
				charArray[i] = (char) (c + 3);
			}
			System.out.print(charArray[i]);
		}
	}

}
