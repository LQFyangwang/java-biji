
public class StuConstructor {
	
	int no;
	String name;
	int age;
	String gender;
	
	public StuConstructor() {
		
	}
	
	public StuConstructor(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public StuConstructor(int no, String name, int age, String gender) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void print() {
		System.out.println("no: " + this.no + ", name: " + this.name + ", age: " + this.age + ", gender: " + this.gender);
	}
	
	void test(int no) {
		System.out.println(no); // �����Ĳ���no
		System.out.println(this.no); // ����
	}
	
	void test() {
		System.out.println(no); // ����
	}
	
	public static void main(String[] args) {
		StuConstructor stu1 = new StuConstructor();
		stu1.print();
		StuConstructor stu2 = new StuConstructor(1, "С��", 20, "��");
		stu2.print();
		StuConstructor stu3 = new StuConstructor(1, "С��");
		stu3.print();
	}

}
