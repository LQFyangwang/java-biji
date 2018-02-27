package com.gs.exception;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age)  throws StudentAgeException{ // �����˷������׳�ѧ�������쳣��
		if (age < 0 || age > 150) {
			// �������С0���ߴ���150����˷�����Ҫ�׳�ѧ�������쳣
			// �����ذ��쳣�׳���ʹ��throw�ؼ��֣����������Ҫ�׳����쳣��Ķ���
			throw new StudentAgeException(); 
		} 
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		try {
			stu.setAge(-10);
		} catch (StudentAgeException e) {
			System.out.println("ѧ������������");
			System.out.println(e);
		}
	}

}
