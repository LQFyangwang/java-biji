
public class Person {
	
	String name; // ����
	int age; // ����
	String gender; // �Ա�
	int height; // ���
	float weigth; // ����
	String phoneNo; // �ֻ���
	
	void run() {
		System.out.println("�ܲ��С�����");
	}
	
	void read() {
		System.out.println("�����С�����");
	}
	
	void eat() {
		System.out.println("�Է��С�����");
	}
	
	public static void main(String[] args) {
		Person p = new Person(); // ����һ�������������������Person��
		p.run();
		p.read();
		p.eat();
	}

}
