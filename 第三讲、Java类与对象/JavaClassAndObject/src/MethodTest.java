
class MethodTest {
	
	int a;
	String b;
	
	/**
	 * 构造方法，在使用new关键字创建对象时调用
	 */
	public MethodTest() {
		this.a = 100;
		this.b = "abc";
	}
	
	public MethodTest(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public MethodTest(int a) {
		this.a = a;
	}
	
	public MethodTest(String b) {
		this.b = b;
	}
	
	void testA(int a, int b) {
		
	}
	
	int testA(int b, float a) {
		return 10;
	}
	
	void testA(float b, int a) {
		
	}
	
	/**
	 * 初始化本类对象的属性值
	 * @param a
	 * @param b
	 */
	void init(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * 打印本类对象的属性值
	 */
	void print() {
		System.out.println("a: " + this.a + ", b: " + this.b);
	}
	
	void test1() {
		System.out.println("test1方法");
	}
	
	void test2(int a) {
		System.out.println(a);
	}
	
	int test3() {
		return 10;
	}
	
	int test4(int x) {
		return x + 10;
	}
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.test1();
		mt.test2(10);
		System.out.println(mt.test3());
		System.out.println(mt.test4(10));
		mt.init(10, "test");
		mt.print();
		MethodTest mt1 = new MethodTest();
		// 通过MethodTest这个构造方法创建出mt1对象，并且已经在构造方法中初始化了a和b的值
		mt1.print();
		MethodTest mt2 = new MethodTest(200, "def");
		// 通过MethodTest(int, String)这个构造方法创建出mt2对象，创建对象的时候，通过参数的方式指定此对象需要初始化的值
		mt2.print();
		MethodTest mt3 = new MethodTest(300, "ghi");
		mt3.print();
		MethodTest mt4 = new MethodTest(400);
		mt4.print();
		MethodTest mt5 = new MethodTest("jkl");
		mt5.print();
	}

}
