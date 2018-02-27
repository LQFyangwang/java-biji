package com.gs.jdkclass;

public class Person {
	
	public static void main(String[] args) {
		Person p = new Person();
		Animal a = new Animal();
		Class c = p.getClass();
		Class c1 = a.getClass();
		System.out.println(c.getName()); // 获取类的名称
		System.out.println(c1.getName());
		// Person p1 = (Person) p.clone(); // 对象的拷贝
	}

}
