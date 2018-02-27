package com.gs;

public class Student {
	
	public int no;
	protected String name;
	private int age;
	String gender;
	
	@Override
	public String toString() {
		return "age:" + this.age;
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 10;
	}
	
}

class Student1 {
	
}



