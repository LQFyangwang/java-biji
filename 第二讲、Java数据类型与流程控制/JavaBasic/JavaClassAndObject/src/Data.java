
public class Data {
	
	int a;
	int b;
	
	void changeData(Data d) {
		d.a = 100; // d与main方法里的d引用同一个区域的值
		d.b = 100;
		System.out.println(d.a + ", " + d.b);
	}
	
	void changeData1(Data d) {
		d = new Data(); // 重新创建了一个对象，与main方法里的d引用不同区域的值
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
