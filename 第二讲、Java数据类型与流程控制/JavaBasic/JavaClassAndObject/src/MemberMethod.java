
public class MemberMethod {
	
	int a;
	String b;
	
	/**
	 * �������Ĺ��췽������˷��������ֶ�д����
	 */
	public MemberMethod() {
		
	}
	
	public MemberMethod(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * û����static���εĳ�Ϊʵ������
	 */
	void print() {
		test(); // ������ʵ��������ֱ�ӵ��þ�̬����
		System.out.println("a: " + a + ", b: " + b);
	}
	
	/**
	 * �ڷ����ķ���ֵ����ǰ��static�ؼ��֣���˷���Ϊ��̬����
	 */
	static void test() {
		// print(); // �����ھ�̬�����е���ʵ������
		System.out.println("static test()");
	}
	
	public static void main(String[] args) {
		MemberMethod mm = new MemberMethod();
		test(); // ����ֱ����static�����ڵ��� 
		mm.test(); // Ҳ����ʹ�ö���������
		MemberMethod.test(); // ֱ��ʹ����������
		// print(); // ����ֱ�ӵ���ʵ��������������ʹ�ö���������
		mm.print();
	}

}
