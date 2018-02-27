
public class Student {
	/**
	 * 如果要分辨两个学生是否为同一个学生，则需要根据学号来判断
	 */
	int no;
	String name;
	int age;
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.no = 1;
		stu1.name = "张三";
		stu1.age = 20;
		Student stu2 = new Student();
		stu2.no = 1;
		stu2.name = "张三";
		stu2.age = 20;
		System.out.println(stu1 == stu2); // false
		System.out.println(stu1.sss(stu1, stu2)); // true  根据学号是否一致来判断是否为同一个学生
	}
	
	boolean sss(Student stu1, Student stu2) {
		if (stu1.no == stu2.no) {
			return true;
		}
		return false;             
	}
	
}
