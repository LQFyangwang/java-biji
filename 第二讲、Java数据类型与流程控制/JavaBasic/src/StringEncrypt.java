import java.util.Scanner;

public class StringEncrypt {
	
	public static void main(String... args) {
		System.out.println("������һ��Ӣ���ַ���");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		// ��ȡ�ַ����е�ÿһ���ַ�
		char[] charArray = str.toCharArray(); // str.toCharArray() ���ַ����е�ÿһ���ַ���˳��ŵ��ַ�������
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
