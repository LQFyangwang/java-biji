import java.util.Random; // import�ؼ��ְ���Ҫ�õ���jdk���ļ����е���
import java.util.Scanner;

public class NumberGame {
	
	public static void main(String[] args) {
		// ��������� class Random  ר�����ڲ����������һ��class
		Random ran = new Random();
		int ranNumber = ran.nextInt(100); // ��ʾ����һ��<=100�������������
		System.out.printf("�������������%d\n",  ranNumber); // "" + ""   �����ַ�������ƴ��
	
		Scanner scanner = new Scanner(System.in); // System.in��ʾ��׼����̨����
		do {
			/**
			 * System.out.println()�Զ����� System.out.print()�����Զ�����  print("\n")
			 */
			System.out.println("���������µ�����(0-100֮�������)��");
				// �ȴ��û��ӿ���̨����һ������
		} while (ranNumber != scanner.nextInt());
		System.out.println("��ϲ�����¶��ˣ����Ϊ��" + ranNumber  );
		scanner.close(); // �ر�����
	}

}