
public class Student2 {

	int no;
	String name;
	int age;
	
	void init() {
		this.no = 1;
		this.name = "����";
		this.age = 20;
	}
	
	void init1(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	boolean equal(Student2 stu) { // stu1.equals(stu2)
		if (this.no == stu.no) { // �����һ������˭����equal�����������˭����this if (stu1.no == stu2.no)
			return true;
		} 
		return false;
	}
	
	void printInfo() {
		System.out.println(this.no + ", " + this.name + ", " + this.age);
	}
	
	public static void main(String[] args) {
		Student2 stu1 = new Student2();
		stu1.init();
		Student2 stu2 = new Student2();
		stu2.init();
		System.out.println(stu1 == stu2); // false
		System.out.println(stu1.equal(stu2)); // true  ����ѧ���Ƿ�һ�����ж��Ƿ�Ϊͬһ��ѧ��
		stu1.printInfo(); // 
		Student2 stu3 = new Student2();
		stu3.init1(2, "����", 29);
		stu3.printInfo(); // 
	}
}
