package mainpackage;

public class Parent {
	
	public int a;
	protected int b;
	private int c;
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public Parent() {
		
	}
	
	public Parent(int a, int b, int c) {
		this.a = a;
		this.b = b;
	}

}
