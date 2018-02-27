package mainpackage;

public class MainSubClass extends MainClass {
	
	public MainSubClass() {
		super();
	}
	
	public MainSubClass(int a) {
		super(a);
	}
	
	@Override
	public void test() {
		System.out.println("MainSubClass");
	}

}
