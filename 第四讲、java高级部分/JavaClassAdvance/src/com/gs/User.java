package com.gs;

public class User {
	
	/**
	 * private修饰的属性只能在自己的类中使用，其他类访问不到。隐藏属性--->类的封装
	 * 如果其他类想要访问此类private修饰的属性，则必须提供一个公开的方法去获取和设置此属性
	 * 提供一个setMemberName方法专门用于设置属性的值, setter访问器，用来设置属性值
	 * 提供一个getMemberName方法专门用于获取属性的值, getter访问器，用来获取属性值
	 */
	private String name; 
	private int age;
	private String gender;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}@Override
	public String toString() {
		return "name: " + name + ", age: " + age + ", gender: " + gender;
	}
	
	
	/**
	 * 隐藏方法，只有本类中使用·
	 */
	private void eat() {
		
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.name = "abc";
		user.eat();
	}

}
