import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int age = 0;
		do {
			System.out.println("������һ�����������䣨�س���������");
			name = scanner.next(); // 
			age = scanner.nextInt(); // �ڶ��������ʱ��xx�Ǳ�nextInt()���յģ�������쳣java.util.InputMismatchException�����벻ƥ���쳣��
			System.out.println("����������������䣺" + name + ", " + age);
		} while (!name.equals("abc") && age != 18);
		scanner.close();
		System.out.println("�¶��ˡ�����");
	}

}
