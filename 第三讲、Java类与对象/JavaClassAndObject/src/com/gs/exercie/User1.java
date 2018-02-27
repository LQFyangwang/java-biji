package com.gs.exercie;

public class User1 {
	
	String name;
	String pwd;
	
	public User1() {
		
	}
	
	public User1(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	String getPwd() {
		return this.pwd;
	}
	
	void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", pwd: " + this.pwd; // 原先默认的实现是返回类的全限定名+@+对象的hashcode(哈希码)
	}
	
	public static void main(String[] args) {
		User1 u = new User1();
		u.setName("小张");
		u.setPwd("123456");
		System.out.println(u.getName() + ": " + u.getPwd());
		User1 u1 = new User1();
		u1.setName("xxx");
		u1.setPwd("xxx");
		System.out.println(u1.getName() + ": " + u1.getPwd());
		System.out.println(u1.toString());
		System.out.println(u1); // 与上一行一样的
	}

}
