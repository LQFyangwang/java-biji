
public class Data {
	
	int a;
	int b;
	
	void changeData(Data d) {
		d.a = 100; // d��main�������d����ͬһ�������ֵ
		d.b = 100;
		System.out.println(d.a + ", " + d.b);
	}
	
	void changeData1(Data d) {
		d = new Data(); // ���´�����һ��������main�������d���ò�ͬ�����ֵ
		d.a = 100;
		d.b = 100;
		System.out.println(d.a + ", " + d.b);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.a = 10;
		d.b = 10;
		d.changeData1(d);
		System.out.println(d.a + ", " + d.b);
	}

}
