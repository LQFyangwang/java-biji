package com.gs.exercie;

public class User {
	
	String name;
	String pwd;
	static int count; // 一定是每次实例化User对象的时候，都应该进行加1操作，所有对象共享这个变量
	
	public User() {
		count++;
	}
	
	public User(String name) {
		this.name = name;
		count++;
	}
	
	public User(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
		count++;
	}
	
	void set(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	void print() {
		System.out.println("name: " + this.name + ", pwd: " + this.pwd + ", 共" + count + "人");
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + ", pwd: " + this.pwd + ", 共" + count + "人";
	}
	
	public static void main(String[] args) {
		User u =new User();
		u.set("小S", "123456");
		u.print();
		User u1 = new User("小明");
		u1.print();
		User u2 = new User("小张", "123456");
		u2.print();
		System.out.println(u2.toString());
	}

}
