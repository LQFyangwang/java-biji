
class MethodTest {
	
	int a;
	String b;
	
	/**
	 * ���췽������ʹ��new�ؼ��ִ�������ʱ����
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
	 * ��ʼ��������������ֵ
	 * @param a
	 * @param b
	 */
	void init(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * ��ӡ������������ֵ
	 */
	void print() {
		System.out.println("a: " + this.a + ", b: " + this.b);
	}
	
	void test1() {
		System.out.println("test1����");
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
		// ͨ��MethodTest������췽��������mt1���󣬲����Ѿ��ڹ��췽���г�ʼ����a��b��ֵ
		mt1.print();
		MethodTest mt2 = new MethodTest(200, "def");
		// ͨ��MethodTest(int, String)������췽��������mt2���󣬴��������ʱ��ͨ�������ķ�ʽָ���˶�����Ҫ��ʼ����ֵ
		mt2.print();
		MethodTest mt3 = new MethodTest(300, "ghi");
		mt3.print();
		MethodTest mt4 = new MethodTest(400);
		mt4.print();
		MethodTest mt5 = new MethodTest("jkl");
		mt5.print();
	}

}
