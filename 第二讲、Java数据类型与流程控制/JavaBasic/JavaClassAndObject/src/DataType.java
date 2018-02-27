
public class DataType {
	
	void test(int a) {
		a = 20;
		System.out.println(a); // 20
	}
	
	void test1(int[] a) {
		a[0] = 10;
		 
		System.out.println(a[0]); // 10Student1.java
	}
	
	public static void main(String... args) {
		DataType dataType = new DataType();
		int a = 10;
		dataType.test(a);
		System.out.println(a); // 10
		int[] b = {1, 2, 3};
		dataType.test1(b);
		System.out.println(b[0]); // 10
	}

}
