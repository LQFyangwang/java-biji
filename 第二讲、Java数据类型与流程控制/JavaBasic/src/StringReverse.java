import java.util.Scanner;

public class StringReverse {
	//�ַ������������
	public static void main(String[] args) {
		System.out.println("��������Ҫ����������ַ���");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		char[] charArray = str.toCharArray();
		for (int len = charArray.length, i = len - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
