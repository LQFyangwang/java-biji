
public class MemberMethod {
	
	int a;
	String b;
	
	/**
	 * 有其他的构造方法，则此方法必须手动写出来
	 */
	public MemberMethod() {
		
	}
	
	public MemberMethod(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * 没有用static修饰的称为实例方法
	 */
	void print() {
		test(); // 可以在实例方法中直接调用静态方法
		System.out.println("a: " + a + ", b: " + b);
	}
	
	/**
	 * 在方法的返回值类型前加static关键字，则此方法为静态方法
	 */
	static void test() {
		// print(); // 不能在静态方法中调用实例方法
		System.out.println("static test()");
	}
	
	public static void main(String[] args) {
		MemberMethod mm = new MemberMethod();
		test(); // 可以直接在static方法内调用 
		mm.test(); // 也可以使用对象来调用
		MemberMethod.test(); // 直接使用类来调用
		// print(); // 不能直接调用实例方法，而必须使用对象来调用
		mm.print();
	}

}
