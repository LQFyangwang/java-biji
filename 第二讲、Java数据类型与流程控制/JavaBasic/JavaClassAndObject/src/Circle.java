
public class Circle {
	
	final double PAI = 3.141592654; // �����Ķ���
	
	int r;
	
	/**
	 * ��ȡԲ�����
	 */
	void getArea() {
		System.out.println("�뾶��" + r + "�� ���Ϊ:" + PAI * r * r);
	}
	
	double getArea1() {
		return PAI * r * r;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.r = 10;
		circle.getArea();
		System.out.println(circle.getArea1());
		circle.r = 20;
		circle.getArea();
		System.out.println(circle.getArea1());
		Circle circle1 = new Circle();
		circle1.r = 20;
		circle1.getArea();
		System.out.println(circle1.getArea1());
	}

}
