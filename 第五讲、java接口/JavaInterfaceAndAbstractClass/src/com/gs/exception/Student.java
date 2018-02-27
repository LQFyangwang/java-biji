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
	public void setAge(int age)  throws StudentAgeException{ // 声明此方法会抛出学生年龄异常类
		if (age < 0 || age > 150) {
			// 如果年龄小0或者大于150，则此方法需要抛出学生年龄异常
			// 真正地把异常抛出，使用throw关键字，后面跟上需要抛出的异常类的对象
			throw new StudentAgeException(); 
		} 
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		try {
			stu.setAge(-10);
		} catch (StudentAgeException e) {
			System.out.println("学生年龄有问题");
			System.out.println(e);
		}
	}

}
