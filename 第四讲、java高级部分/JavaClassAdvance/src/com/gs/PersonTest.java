package com.gs;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("�����ʿ");
		p.setAge(20);
		p.setGender("��");
		p.eat();
		p.sleep();
		System.out.println(p);
		Stu stu = new Stu();
		stu.setName("ѧ��1");
		stu.setAge(20);
		stu.setGender("��");
		stu.setClazz("2��");
		stu.eat();
		stu.sleep();
		stu.read();
		stu.study();
		System.out.println(stu);
		Teacher teacher = new Teacher();
		teacher.setName("��ʦ1");
		teacher.setAge(30);
		teacher.setGender("Ů");
		teacher.setSubject("��ѧ");
		teacher.eat();
		teacher.sleep();
		teacher.teach();
		teacher.checkHomework();
		MiddleSchoolStu stu1 = new MiddleSchoolStu();
		stu1.setName("С��");
		stu1.setAge(16);
		stu1.setGender("��");
		stu1.setClazz("1601");
		stu1.setHasPhone(true);
		stu1.doMorningExercise();
		CollegeStu stu2 = new CollegeStu();
		stu2.setName("����");
		stu2.setAge(23);
		stu2.setGender("��");
		stu2.setHasInternship(true);
		stu2.practice();
	}

}
