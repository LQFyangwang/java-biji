public class JavaControl {
	public static void main(String[] args) {
		// if≈–∂œ
		int a = 100;
		if (a < 100) {
			System.out.println("a < 100");
		} else if (a == 100) {
			System.out.println("a = 100");
		} else {
			System.out.println("a > 100");
		}
		// switch... case
		int grade = 1;
		switch (grade) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("≤Ó");
			break;
			case 5:
				System.out.println("÷–");
			break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("∫√");
			break;
			default:break;
		}
		// do...while
		int b = 0;
		do {
			System.out.println(b);
			b++;
		} while (b <= 10);
		// while
		b = 0;
		while (b <= 10) {
			System.out.println(b++);
		}
		// for
		for (int c = 0; c <= 10; c++) {
			System.out.println(c);
		}
		//for
		int d = 0;
		for (; d <= 10; d++) {
			System.out.println(d);
		}
		//for
		int e = 0;
		for (; e <= 10; ) {
			System.out.println(e++);
		}
	}
}