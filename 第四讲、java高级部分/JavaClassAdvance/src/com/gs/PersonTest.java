package com.gs;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("社会人士");
		p.setAge(20);
		p.setGender("男");
		p.eat();
		p.sleep();
		System.out.println(p);
		Stu stu = new Stu();
		stu.setName("学生1");
		stu.setAge(20);
		stu.setGender("男");
		stu.setClazz("2班");
		stu.eat();
		stu.sleep();
		stu.read();
		stu.study();
		System.out.println(stu);
		Teacher teacher = new Teacher();
		teacher.setName("老师1");
		teacher.setAge(30);
		teacher.setGender("女");
		teacher.setSubject("数学");
		teacher.eat();
		teacher.sleep();
		teacher.teach();
		teacher.checkHomework();
		MiddleSchoolStu stu1 = new MiddleSchoolStu();
		stu1.setName("小明");
		stu1.setAge(16);
		stu1.setGender("男");
		stu1.setClazz("1601");
		stu1.setHasPhone(true);
		stu1.doMorningExercise();
		CollegeStu stu2 = new CollegeStu();
		stu2.setName("张三");
		stu2.setAge(23);
		stu2.setGender("男");
		stu2.setHasInternship(true);
		stu2.practice();
	}

}
