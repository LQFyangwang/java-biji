import java.util.Scanner;

public class ScoreGrade {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		do {
			System.out.println("请输入分数（0-100）");
			score = scanner.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("分数只能是0-100之间");
			} else {
				String grade = ""; // 定义一个字符串
				if (score >= 90 && score <= 100) {
					grade = "优";
				} else if (score >= 80 && score <= 89) {
					grade = "良";
				} else if (score >= 60 && score <= 79) {
					grade = "中";
				} else if (score < 60) {
					grade = "差";
				}
				System.out.println(grade);
				// 第二种方案
				int a = score / 10;
				switch (a) {
				case 10:
				case 9:
					grade = "优";
					break;
				case 8:
					grade = "良";
					break;
				case 7:
				case 6:
					grade = "中";
					break;
				default:
					grade = "差";
					break;
				}
				System.out.println(grade);
			}
		} while (score < 0 || score > 100);//如果滿足條件就跳出循環，不滿足就接這循環
		scanner.close();
	}

}
