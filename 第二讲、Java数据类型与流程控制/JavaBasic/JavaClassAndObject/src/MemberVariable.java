
public class MemberVariable {
	
	int a;
	String b;
	static int c;
	static String d;
	
	public MemberVariable() {
		
	}
	
	public MemberVariable(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	void print() {
		System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);
	}
	
	static void test() {
		System.out.println(d);
		// System.out.println(a); // 静态方法里不能引用实例变量
	}
	
	public static void main(String[] args) {
		MemberVariable mv = new MemberVariable(10, "abc");
		MemberVariable.c = 100; // 直接使用类来引用静态变量
		MemberVariable.d = "test";
		mv.print(); // 10 abc 100 test
		MemberVariable mv1 = new MemberVariable(20, "def");
		MemberVariable.c = 200;
		MemberVariable.d = "new test";
		mv1.print(); // 20 def 200 new test
		MemberVariable mv2 = new MemberVariable(30, "ghi");
		mv2.print(); // 30 ghi 200 new test
	}

}
