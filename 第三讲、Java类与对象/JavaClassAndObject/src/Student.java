
public class Student {
	/**
	 * ���Ҫ�ֱ�����ѧ���Ƿ�Ϊͬһ��ѧ��������Ҫ����ѧ�����ж�
	 */
	int no;
	String name;
	int age;
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.no = 1;
		stu1.name = "����";
		stu1.age = 20;
		Student stu2 = new Student();
		stu2.no = 1;
		stu2.name = "����";
		stu2.age = 20;
		System.out.println(stu1 == stu2); // false
		System.out.println(stu1.sss(stu1, stu2)); // true  ����ѧ���Ƿ�һ�����ж��Ƿ�Ϊͬһ��ѧ��
	}
	
	boolean sss(Student stu1, Student stu2) {
		if (stu1.no == stu2.no) {
			return true;
		}
		return false;             
	}
	
}
