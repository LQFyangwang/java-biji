package com.gs.exercie;

import java.util.Scanner;

public class Student {
	
	String name;
	int age;
	float score;
	
	void print() {
		System.out.println("name: " + this.name + ", age: " 
				+ this.age + ", score: " + this.score);
	}
	
	void input() {
		System.out.println("请输入年龄和成绩（回车分割）");
		Scanner scanner = new Scanner(System.in);
		String ageStr = scanner.next();
		this.age = Integer.valueOf(ageStr); // Integer this.age = Integer的值
		// this.age = Integer.parseInt(ageStr); // int
		String scoreStr = scanner.next();
		this.score = Float.valueOf(scoreStr); // Float
		// this.score = Float.parseFloat(scoreStr); // float
		scanner.close();
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.input();
		stu.print();
	}

}
