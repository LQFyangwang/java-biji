
public class Student1 {

	int no;
	String name;
	int age;
	
	boolean equal(Student1 stu) { // stu1.equals(stu2)
		if (this.no == stu.no) { // 本类的一个对象，谁调用equal这个方法，则谁就是this if (stu1.no == stu2.no)
			return true;
		} 
		return false;
	}
	
	void printInfo() {
		System.out.println(this.no + ", " + this.name + ", " + this.age);
	}
	
	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		stu1.no = 1;
		stu1.name = "张三";
		stu1.age = 20;
		Student1 stu2 = new Student1();
		stu2.no = 1;
		stu2.name = "张三";
		stu2.age = 20;
		System.out.println(stu1 == stu2); // false
		System.out.println(stu1.equal(stu2)); // true  根据学号是否一致来判断是否为同一个学生
		stu1.printInfo(); // 1, 张三, 20
		Student1 stu3 = new Student1();
		stu3.no = 2;
		stu3.name = "李四";
		stu3.age = 29;
		stu3.printInfo(); // 2, 李四, 29
	}
}
