import java.util.Scanner;

public class ScoreGrade {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		do {
			System.out.println("�����������0-100��");
			score = scanner.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("����ֻ����0-100֮��");
			} else {
				String grade = ""; // ����һ���ַ���
				if (score >= 90 && score <= 100) {
					grade = "��";
				} else if (score >= 80 && score <= 89) {
					grade = "��";
				} else if (score >= 60 && score <= 79) {
					grade = "��";
				} else if (score < 60) {
					grade = "��";
				}
				System.out.println(grade);
				// �ڶ��ַ���
				int a = score / 10;
				switch (a) {
				case 10:
				case 9:
					grade = "��";
					break;
				case 8:
					grade = "��";
					break;
				case 7:
				case 6:
					grade = "��";
					break;
				default:
					grade = "��";
					break;
				}
				System.out.println(grade);
			}
		} while (score < 0 || score > 100);//����M��l��������ѭ�h�����M��ͽ��@ѭ�h
		scanner.close();
	}

}
