
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
		System.out.println(no); // 方法的参数no
		System.out.println(this.no); // 属性
	}
	
	void test() {
		System.out.println(no); // 属性
	}
	
	public static void main(String[] args) {
		StuConstructor stu1 = new StuConstructor();
		stu1.print();
		StuConstructor stu2 = new StuConstructor(1, "小明", 20, "男");
		stu2.print();
		StuConstructor stu3 = new StuConstructor(1, "小张");
		stu3.print();
	}

}
