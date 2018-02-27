package mainpackage;

public class MainClass {
	
	private int a;
	
	public MainClass() {
		System.out.println(a);
	}
	
	public MainClass(int a) {
		this.a = a;
		System.out.println(this.a);
	}
	
	public void test() {
		System.out.println("MainClass");
	}

}
