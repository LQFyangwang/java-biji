package com.gs.exercise;
/**编写Java程序，用于显示人的姓名和年龄。 定义一个人类（Person），
 * 该类中应该有两个私有属性，姓名（name）和年龄（age）。定义构造方法，
 * 用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
 */
public class Person {
	
	private String name; // 定义一个String类型的成员属性，成员属性的名称为name
	private int age; // 定义一个int类型的成员属性，属性名称为age
	
	public Person() {
		// 无参空实现的构造方法
	}
	
	/**
	 * 添加一个用于初始化name属性和age属性的构造方法，参数名称与属性名称一致
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name; // this代表本类对象，this.name表示引用本类对象的name属性
		this.age = age;
	}
	
	public void display() {
		System.out.println("姓名：" + this.name + ", 年龄：" + this.age);
	}
	
	@Override
	public String toString() {
		return "姓名：" + this.name + ", 年龄：" + this.age;
	}
	
	public static void main(String[] args) {
		Person p = new Person(); // 使用无参构造方法来创建Person类的一个对象
		Person p1 = new Person("小明", 20); // 使用有参构造方法来创建Person类的一个对象，并且初始化此对象的属性
		p1.display(); // 告诉p1这个对象，调用display方法来显示出属性值
	}
}
