
public class Person1 {
	
	String name; // ����
	int age; // ����
	String gender; // �Ա�
	int height; // ���
	float weight; // ����
	String phoneNo; // �ֻ���
	
	void run() {
		System.out.println(name + "�ܲ��С�����");
	}
	
	void read() {
		System.out.println(name + "�����С�����");
	}
	
	void eat() {
		System.out.println(name + "�Է��С�����");
	}
	
	void printInfo() {
		System.out.println("������ " + name + ", ���䣺 " + age + ", �Ա� " + gender 
				+ ", ��ߣ�" + height + ", ���أ�" + weight + ", �ֻ���: " + phoneNo);
	}
	
	public static void main(String[] args) {
		Person1 p = new Person1(); // ����һ�������������������Person��
		p.name = "����";
		p.age = 20;
		p.gender = "��";
		p.height = 170;
		p.weight = 50;
		p.phoneNo = "18888888888";
		p.printInfo();
		System.out.println(p.name + "�����䣺" + p.age);
		p.run();
		p.read();
		p.eat();
		Person1 p1 = new Person1();
		p1.name = "����";
		p1.age = 30;
		p1.gender = "Ů";
		p1.height = 170;
		p1.weight = 50;
		p1.phoneNo = "13666666666";
		p1.printInfo();
		System.out.println(p1.name + "�����䣺" + p1.age);
		p1.run();
		p1.read();
		p1.eat();
	}

}
